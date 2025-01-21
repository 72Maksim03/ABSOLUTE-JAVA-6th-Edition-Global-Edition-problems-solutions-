import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File("advice.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }

        while(sc.hasNextLine()) System.out.println(sc.nextLine());
        sc.close();

        System.out.println("Do you want to write new advices? [y]/[n]");
        Scanner kb = new Scanner(System.in);
        if (kb.next().charAt(0) == 'y'){
            kb.nextLine();
            PrintWriter pw = null;
            try{
                pw = new PrintWriter("advice.txt");
            } catch (FileNotFoundException e){
                System.out.println("Error opening file for writing");
                System.exit(1);
            }
            System.out.println("Enter advices");
            String advice = kb.nextLine();
            while(!advice.isEmpty()){
                pw.println(advice);
                advice = kb.nextLine();
            }
            pw.close();
        }
    }
}
