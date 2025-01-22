import java.io.*;
import java.util.Scanner;
/**
 * Write a program that will search a binary file of numbers of type int and write
 * the largest and the smallest numbers to the screen. The file contains nothing but
 * numbers of type int written to the file with writeInt.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number:");
        int num = sc.nextInt();
        System.out.println("Enter number of numbers");
        int count = sc.nextInt();

        if (num <= 0 || count <= 0) {
            System.out.println("Maximum number and count must be greater than 0.");
            return;
        }

        fill("numbers.dat", num, count);

        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("numbers.dat"))){
            int min = num;
            int max = 0;

            for (int i = 0; i < count; i++){
                int number = inp.readInt();
                if (number > max) max = number;
                if (number < min) min = number;
            }
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Problems with file input");
        }
    }

    public static void fill(String fileName, int maxNum, int num){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            for (int i = 0; i < num; i++){
                int n = (int) (Math.random() * maxNum);
                out.writeInt(n);
            }
        } catch (IOException e){
            System.out.println("Problems with file output");
        }
    }
}
