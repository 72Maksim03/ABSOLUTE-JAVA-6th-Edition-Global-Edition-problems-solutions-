import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("numbers.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        double sum = 0;
        int count = 0;

        while (sc.hasNext()){
            double num = sc.nextDouble();
            sum += num;
            count++;
        }

        if (count == 0){
            System.out.println("No numbers to compute average and standard deviation");
            System.exit(0);
        }

        double average = sum / count;
        sc.close();

        try{
            sc = new Scanner(new File("numbers.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        double deviation = 0;

        while (sc.hasNext()){
            double num = sc.nextDouble();
            deviation += ((num - average) * (num - average));
        }

        double standDev = Math.sqrt(deviation / count);

        System.out.println("Average: " + average);
        System.out.println("Standard deviation: " + standDev);
    }
}
