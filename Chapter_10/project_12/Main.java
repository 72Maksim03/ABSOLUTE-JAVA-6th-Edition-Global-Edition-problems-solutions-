import java.util.Scanner;
/**
 * Change the definition of the class Person in Display 5.19 to be serializable. Note
 * that this requires that you also change the class Date. Then write a program
 * to maintain a binary file of records of people (records of type Person). Allow
 * commands to delete a record specified by the person’s name, to add a record, to
 * retrieve and display a record, and to obtain all records of people within a specified
 * age range. To obtain the age of a person, you need the current date. Your program will ask the user for the current date when the program begins. You can do
 * this with random access files, but do not use random access files for this exercise.
 * Use a file or files that record records with the method writeObject of the class
 * ObjectOutputStream.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records rec = new Records("record.dat");
        System.out.println("Enter current date [dd/mm/yyyy]");
        String currentDate = sc.nextLine();
        Date current = stringToDate(currentDate);

        while(true){
            System.out.println("1. Add a person");
            System.out.println("2. Delete a person by name");
            System.out.println("3. Display person by name");
            System.out.println("4. Display all people in age range");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                System.out.println("Enter a name");
                String name = sc.nextLine();
                System.out.println("Enter birthday [dd/mm/yyyy]");
                String bDay = sc.nextLine();
                Date birthday = stringToDate(bDay);
                System.out.println("Is Person died? [y]/[n]");
                Date deathDate = null;
                if (sc.nextLine().charAt(0) == 'y'){
                    System.out.println("Enter the date");
                    String death = sc.nextLine();
                    deathDate = stringToDate(death);
                }
                Person p = new Person(name, birthday, deathDate);
                rec.add(p);
            } else if (choice == 2){
                System.out.println("Enter a name");
                String name = sc.nextLine();
                rec.delete(name);
            } else if (choice == 3){
                System.out.println("Enter a name");
                String name = sc.nextLine();
                rec.display(name);
            } else if (choice == 4){
                System.out.println("Enter age range (enter 2 numbers separated by whitespace)");
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                sc.nextLine();
                if (a1 > a2) System.out.println("Please enter valid range");
                else rec.display(a1, a2, current);
            } else if (choice == 5) break;
            else System.out.println("Invalid choice");
        }
    }

    public static Date stringToDate(String date){
        String[] temp = date.split("/");
        int year = Integer.parseInt(temp[2]);
        int day = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        return new Date(month, day, year);
    }
}
