import java.util.Scanner;

/**
 * An array can be used to store large integers one digit at a time.
 *  For example, the integer 1234 could be stored in the array a by setting a[0] to 1,
 * a[1] to 2, a[2] to 3, and a[3] to 4. However, for this exercise you might find it
 * more useful to store the digits backward; that is, place 4 in a[0], 3 in a[1], 2 in
 * a[2], and 1 in a[3]. In this exercise, write a program that reads in 2 positive integers that are 20 or fewer digits in length and then outputs the sum of the 2 numbers. Your program will read the digits as values of type char so that the number
 * 1234 is read as the four characters '1', '2', '3', and '4'. After they are read into
 * the program, the characters are changed to values of type int. The digits should
 * be read into a partially filled array; you might find it useful to reverse the order
 * of the elements in the array after the array is filled with data from the keyboard.
 * (Whether or not you reverse the order of the elements in the array is up to you. It
 * can be done either way, and each way has its advantages and disadvantages.) Your
 * program should perform the addition by implementing the usual paper-and-pencil
 * addition algorithm. The result of the addition should be stored in an array of size
 * 20, and the result should then be written to the screen. If the result of the addition
 * is an integer with more than the maximum number of digits (that is, more than
 * 20 digits), then your program should issue a message saying that it has encountered
 * “integer overflow.” You should be able to change the maximum length of the integers by changing only one named constant. Include a loop that allows the user to
 * continue to do more additions until the user says the program should end.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    private static final int NUM_LENGTH = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        String n1 = sc.nextLine();
        if (n1.length() > NUM_LENGTH){
            System.out.println("Integer overflow");
            System.exit(0);
        }

        System.out.println("Enter the second number");
        String n2 = sc.nextLine();
        if (n2.length() > NUM_LENGTH){
            System.out.println("Integer overflow");
            System.exit(0);
        }

        System.out.println("Sum: " + sum(n1, n2));
    }

    public static String sum(String n1, String n2){
        int[] num1 = strToArray(n1, NUM_LENGTH);
        int[] num2 = strToArray(n2, NUM_LENGTH);

        int[] sum = new int[NUM_LENGTH];
        int carry = 0;
        for (int i = 0; i < sum.length; i++){
            int temp = num1[i] + num2[i] + carry;
            sum[i] = temp % 10;
            carry = temp / 10;
        }
        if (carry > 0){
            System.out.println("Integer overflow");
            System.exit(0);
        }

        int index = sum.length - 1;
        StringBuilder sb = new StringBuilder();
        while (sum[index] == 0) index--;
        while (index >= 0) sb.append(sum[index--]);
        return sb.toString();
    }

    private static int[] strToArray(String str, int arrLength){
        int[] res = new int[arrLength];
        for (int i = 0; i < arrLength; i++)
            res[i] = (i < str.length()) ?str.charAt(str.length() - i - 1) - '0' : 0;
        return res;
    }
}
