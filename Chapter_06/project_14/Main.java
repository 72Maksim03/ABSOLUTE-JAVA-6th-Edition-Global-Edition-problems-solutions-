import java.util.Scanner;
/**
 * . Traditional password entry schemes are susceptible to “shoulder surfing” in which
 * an attacker watches an unsuspecting user enter his or her password or PIN number
 * and uses it later to gain access to the account. One way to combat this problem
 * is with a randomized challenge-response system. In these systems, the user enters
 * different information every time based on a secret in response to a randomly generated challenge.
 * Consider the following scheme in which the password consists of a
 * five-digit PIN number (00000 to 99999). Each digit is assigned a random number
 * that is 1, 2, or 3. The user enters the random numbers that correspond to their PIN
 * instead of their actual PIN numbers.
 *  For example, consider an actual PIN number of 12345. To authenticate it, the user
 * would be presented with a screen such as the following:
 *  PIN: 0 1 2 3 4 5 6 7 8 9
 *  NUM: 3 2 3 1 1 3 2 2 1 3
 *  The user would enter 23113 instead of 12345. This does not divulge the password
 * even if an attacker intercepts the entry because 23113 could correspond to other
 * PIN numbers, such as 69440 or 70439. The next time the user logs in, a different
 * sequence of random numbers would be generated, such as the following:
 *  PIN: 0 1 2 3 4 5 6 7 8 9
 *  NUM: 1 1 2 3 1 2 2 3 3 3
 *  Your program should simulate the authentication process. Store an actual PIN
 * number in your program. The program should use an array to assign random
 * numbers to the digits from 0 to 9. Output the random digits to the screen, input
 * the response from the user, and output whether or not the user’s response correctly
 * matches the PIN number.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        fill(arr);
        String pin = "78549";
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Enter password");
        String inputPin = sc.nextLine();

        if (checkPin(pin, inputPin, arr)) System.out.println("PIN is correct");
        else System.out.println("PIN is incorrect");
    }

    public static boolean checkPin(String pin, String inputPin, int[] schemes){
        if (pin.length() != inputPin.length()) return false;
        for (int i = 0; i < pin.length(); i++)
            if (inputPin.charAt(i) - '0' != schemes[pin.charAt(i) - '0']) return false;
        return true;
    }

    public static void fill(int[] arr){
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 3 + 1);
    }
}
