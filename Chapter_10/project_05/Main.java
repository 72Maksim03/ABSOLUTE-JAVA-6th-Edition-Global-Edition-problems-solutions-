import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Write a program that edits a text file to display each complete sentence with a
 * period at the end in a separate line. Your program should work as follows: Create
 * a temporary file, copy from the source file to a temporary file and perform the
 * required operation. Copy the contents of the temporary file back into the source
 * file. Use a method (or methods) in the class File to remove the temporary file.
 * You will also want to use the class File for other things in your program. The
 * temporary file should have a name that is different from all existing files so that
 * the existing files are not affected (except for the file being edited). Your program
 * will ask the user for the name of the file to be edited. However, it will not ask the
 * user for the name of the temporary file, but will instead generate the name within
 * the program. You can generate the name any way that is clear and efficient. One
 * possible way to generate the temporary file is to start with an unlikely name, such
 * as "Temp1", and to append a digit, such as '1', until a name is found that does
 * not name an existing file.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter file name");
        String fileName = kb.nextLine();

        try{
            sc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        int tmp = 1;
        File tempFile = new File("temp" + tmp);
        while(tempFile.exists()) tempFile = new File("temp" + ++tmp);

        PrintWriter pw = null;
        try{
            pw = new PrintWriter(tempFile);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        sc.useDelimiter("\\.|\\?|!");

        while(sc.hasNext()){
            String line = sc.next();
            line = line.trim().replaceAll("\n", "");
            pw.println(line + ".");
        }

        sc.close();
        pw.close();

        try{
            sc = new Scanner(tempFile);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        try{
            pw = new PrintWriter(new FileOutputStream(fileName));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            pw.println(line);
        }

        sc.close();
        pw.close();

        tempFile.delete();
    }
}