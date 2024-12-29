public class BubbleSort {
    public static void sort(double[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean isSwapped = false;
            for (int j = i; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}
