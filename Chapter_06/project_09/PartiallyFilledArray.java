public class PartiallyFilledArray {
    private int maxNumberElements;
    private double[] arr;
    private int numberUsed;

    public PartiallyFilledArray(){
        maxNumberElements = 10;
        arr = new double[maxNumberElements];
        numberUsed = 0;
    }

    public PartiallyFilledArray(int arraySize){
        if (arraySize < 0){
            System.out.println("Error Array size zero or negative.");
            System.exit(0);
        }
        maxNumberElements = arraySize;
        arr = new double[maxNumberElements];
        numberUsed = 0;
    }

    public PartiallyFilledArray(PartiallyFilledArray original){
        if (original == null){
            System.out.println("Fatal Error: aborting program.");
            System.exit(0);
        }
        maxNumberElements = original.maxNumberElements;
        numberUsed = original.numberUsed;
        for (int i = 0; i < numberUsed; i++) arr[i] = original.arr[i];
    }

    public void add(double newElement){
        if (numberUsed == maxNumberElements) resize(2 * maxNumberElements);
        arr[numberUsed++] = newElement;
    }

    public double getElement(int index){
        if (index < 0 || index >= numberUsed){
            System.out.println("Invalid index");
            System.exit(0);
        }
        return arr[index];
    }

    public void resetElement(int index, double newElement){
        if (index < 0 || index > maxNumberElements){
            System.out.println("Invalid index");
            System.exit(0);
        }
        arr[index] = newElement;
    }

    public void deleteLast(){
        if (numberUsed == 0){
            System.out.println("Error, array is empty");
            System.exit(0);
        }
        numberUsed--;
    }

    public void delete(int index){
        if (index < 0 || index >= numberUsed){
            System.out.println("Invalid index");
            System.exit(0);
        }
        for (int i = index; i < numberUsed; i++) arr[i] = arr[i+1];
        numberUsed--;
    }

    public boolean empty(){return numberUsed == 0;}
    public boolean full(){return numberUsed == maxNumberElements;}
    public int getMaxCapacity(){return maxNumberElements;}
    public int getNumberOfElements(){return numberUsed;}

    private void resize(int capacity){
        maxNumberElements = capacity;
        double[] newArr = new double[capacity];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        arr = newArr;
    }
}
