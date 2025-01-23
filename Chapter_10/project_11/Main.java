import java.io.*;
/**
 * Write a program that takes its input from a binary file of numbers of type double.
 * The file contains nothing but numbers of type double written to the file with
 * writeDouble. The program outputs to the screen the average and standard deviation of the numbers in the file. The standard deviation of a list of numbers n1,
 * n2, n3, and so forth is defined as the square root of the average of the following
 * numbers:
 * (n1 - a)
 * 2, (n2 - a)
 * 2, (n3 - a)
 * 2, and so forth.
 *  The number a is the average of the numbers n1, n2, n3, and so forth. Hint: Write
 * your program so that it first reads the entire file and computes the average of all the
 * numbers, then closes the file, and then reopens the file and computes the standard
 * deviation. You will find it helpful to first do Programming Project 10.8 and then
 * modify that program in order to obtain the program for this project.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        fill("numbers.dat", 10);
        double sum = 0.0;
        int count = 0;
        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("numbers.dat"))){
            while(true){
                double num = inp.readDouble();
                sum += num;
                count++;
            }
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Error reading file");
            System.exit(1);
        }

        double average = sum / count;

        double standDev = 0.0;
        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("numbers.dat"))){
            while(true){
                double num = inp.readDouble();
                standDev += (num - average) * (num - average);
            }
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Error reading file");
            System.exit(1);
        }

        double averStandDev = standDev / count;
        System.out.println("Average standard deviation: " + averStandDev);
    }

    public static void fill(String fileName, int count){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            for (int i = 0; i < count; i++)
                out.writeDouble((Math.round(Math.random() * 100) / 10.0));
        } catch (IOException e){
            System.out.println("Error accessing file");
            System.exit(1);
        }
    }
}
