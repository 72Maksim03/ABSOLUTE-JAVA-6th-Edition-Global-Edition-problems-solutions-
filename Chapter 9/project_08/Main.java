import java.util.Arrays;

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
