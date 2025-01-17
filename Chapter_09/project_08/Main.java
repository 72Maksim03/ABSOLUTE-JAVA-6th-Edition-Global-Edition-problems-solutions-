import java.util.Arrays;
/**
 * Study the class java.util.Arrays from the Oracle documentation located at
 * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html. The sort method
 * throws an IllegalArgumentException and an OutOfBoundsException. Write
 * a short Java test program that sorts an array of integers and outputs the array elements in sorted order. Your program should catch both of the exceptions listed
 * above. Modify your program to test that the exceptions are properly caught.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {5, 3, 8, 1, 2};
            System.out.println("Original array: " + Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));

            System.out.println("\nTesting IllegalArgumentException...");
            Arrays.sort(array, 2, 1);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting ArrayIndexOutOfBoundsException...");
            int[] anotherArray = {4, 2, 7, 1, 9};
            Arrays.sort(anotherArray, 1, 10);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
