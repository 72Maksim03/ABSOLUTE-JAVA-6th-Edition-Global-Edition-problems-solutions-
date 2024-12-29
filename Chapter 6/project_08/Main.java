/**
 * Design a class called BubbleSort that is similar to the class SelectionSort given
 * in Display 6.11. The class BubbleSort will be used in the same way as the class
 * SelectionSort, but it will use the bubble sort algorithm.
 *  The bubble sort algorithm checks all adjacent pairs of elements in the array from
 * the beginning to the end and interchanges any two elements that are out of order.
 * This process is repeated until the array is sorted. The algorithm is as follows:
 *  Bubble Sort Algorithm to Sort an Array a
 *  Repeat the following until the array a is sorted:
 *  for (index = 0; index < a.length – 1; index++)
 *  if (a[index] > a[index + 1])
 *  Interchange the values of a[index] and a[index + 1].
 *  The bubble sort algorithm is good for sorting an array that is “almost sorted.” It is
 * not competitive with other sorting methods for most other situations.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        double[] arr = {3.5, 2.0, 5.9, 4.1, 8.7};
        printArray(arr);
        BubbleSort.sort(arr);
        printArray(arr);
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
