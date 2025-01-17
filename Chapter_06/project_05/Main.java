import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[15];
        int[] arr2 = new int[15];

        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < arr1.length; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < arr1.length; i++) arr2[i] = sc.nextInt();

        selectionSort(arr1);
        selectionSort(arr2);

        System.out.printf("%4s", "N");
        System.out.printf("%6s", "Count");

        int a1 = 0;
        int a2 = 0;
        while(a1 < arr1.length || a2 < arr2.length){
            int count = 0;
            int temp = (a1 < arr1.length || (a2 < arr2.length && arr1[a1] < arr2[a2]))
                    ? arr1[a1] : arr2[a2];
            while(a1 < arr1.length && arr1[a1] == temp) {
                a1++;
                count++;
            }
            while(a2 < arr2.length && arr2[a2] == temp) {
                a2++;
                count++;
            }
            System.out.println();
            System.out.printf("%4s", temp);
            System.out.printf("%6s", count);
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
