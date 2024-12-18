import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array, no longer than 50");
        int n = sc.nextInt();

        if (n < 0 || n > 50){
            System.out.println("Invalid length");
            System.exit(0);
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        insertionSort(arr);
        System.out.printf("%4s%8s%n", "N", "Count");

        for (int i = 0; i < n; ) {
            int count = 0;
            int current = arr[i];
            while(i < arr.length && arr[i] == current){
                count++;
                i++;
            }
            System.out.printf("%4d%8d%n", current, count);
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}