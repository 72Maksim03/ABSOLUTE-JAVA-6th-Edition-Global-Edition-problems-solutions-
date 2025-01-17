/**
 * Define a class called Administrator, which is a derived class of the class
 * SalariedEmployee in Display 7.5. You are to supply the following additional
 * instance variables and methods:
 * • An instance variable of type String that contains the administrator’s title (such
 * as "Director" or "Vice President").
 * • An instance variable of type String that contains the administrator’s area of
 * responsibility (such as "Production", "Accounting", or "Personnel").
 * • An instance variable of type String that contains the name of this administrator’s immediate supervisor.
 * • Suitable constructors, and suitable accessor and mutator methods.
 * • A method for reading in an administrator’s data from the keyboard.
 *  Override the definitions for the methods equals and toString so they are appropriate to the class Administrator.
 *  Also, write a suitable test program.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Administrator admin1 = new Administrator("name1", new Date(2, 2, 2018), 24000,
                "Director", "Production", "Supervisor1");
        Administrator admin2 = new Administrator("name2", new Date(2, 2, 2018), 36000,
                "Director", "Production", "Supervisor1");
        Administrator admin3 = new Administrator("name1", new Date(2, 2, 2018), 24000,
                "Director", "Production", "Supervisor1");

        System.out.println(admin1.equals(admin2));
        System.out.println(admin3.equals(admin1));

        System.out.println("Admin1: " + admin1);
        System.out.println("Admin2: " + admin2);
        System.out.println("Admin3: " + admin3);
    }
}
