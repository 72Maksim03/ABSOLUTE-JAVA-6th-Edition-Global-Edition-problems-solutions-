/**
 * A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
 * feet of height and 5 pounds for each additional inch. Write a program with a variable
 * for the height of a person in feet and another variable for the additional inches. Assume
 * the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
 * would be represented with a variable that stores the number 6 and another variable that
 * stores the number 3. Based on these values, calculate and output the ideal body weight.
 *
 * @author Maksim Petrosyan
 */
public class Main {
    public static void main(String[] args) {
        int heightFeet = 6;
        int heightInch = 3;
        int idealBodyWeight = ((heightFeet - 5) * 12 + heightInch) * 5 + 110;
        System.out.println("Ideal body weight is " + idealBodyWeight);
    }
}
