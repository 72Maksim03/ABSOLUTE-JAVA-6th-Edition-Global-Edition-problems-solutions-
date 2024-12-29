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
