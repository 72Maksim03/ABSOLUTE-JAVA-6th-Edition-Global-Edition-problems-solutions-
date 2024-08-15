/**
 * Define a class called Journal that could be used to store an entry for a research
 * paper that will be published. The class should have instance variables to store the
 * author’s name, title of the paper, and the date of submission using the Date class
 * from this chapter. Add a constructor to the class that allows the user of the class
 * to set all instance variables. Also add a method, displayDetails, that outputs all
 * the instance variables, and another method called getSubmissionDetails that
 * returns the title of the paper, with the first letter of each word capitalized. Test your
 * class from the main method.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author's name: ");
        String author = sc.nextLine();
        System.out.println("Enter publication title");
        String title = sc.nextLine();
        System.out.println("Enter publication date");
        String date = sc.nextLine();
        Journal journal = new Journal(author, title, date);
        journal.displayDetails();
        System.out.println(journal.getSubmissionDetails());
    }
}
