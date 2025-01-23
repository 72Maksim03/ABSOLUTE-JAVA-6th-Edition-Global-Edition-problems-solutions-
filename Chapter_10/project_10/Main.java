import java.io.*;
/**
 * Write a program that reads grades of type double of eight students that the user
 * provides. The grades lie between 0 and 10. These grades should be written to a
 * binary file and read from it. The program outputs the highest and lowest grades
 * achieved by students on the screen. The file contains nothing but numbers of type
 * double written to the file with writeDouble.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        fillGrades("grades.dat", 8);
        double highest = 0.0;
        double lowest = 10.0;
        try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("grades.dat"))){
            while(true){
                double grade = inp.readDouble();
                if (highest < grade) highest = grade;
                if (lowest > grade) lowest = grade;
            }
        } catch (EOFException e){}
        catch (IOException e){
            System.out.println("Problems reading file");
            System.exit(0);
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

    public static void fillGrades(String fileName, int count){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            for (int i = 0; i < count; i++){
                double num = Math.round(Math.random() * 100) / 10.0;
                out.writeDouble(num);
            }
        } catch (IOException e){
            System.out.println("Problems accessing file");
            System.exit(1);
        }
    }
}