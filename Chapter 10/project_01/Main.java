import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * The text files boynames.txt and girlnames.txt, which are included in the
 * source code for this book text, contain a list of the 1,000 most popular boy and
 * girl names in the United States for the year 2003 as compiled by the Social Security
 * Administration.
 *  These are blank-delimited files, where the most popular name is listed first, the
 * second most popular name is listed second, and so on, to the 1,000th most popular
 * name, which is listed last. Each line consists of the first name followed by a blank
 * space and then the number of registered births using that name in the year. For
 * example, the girlnames.txt file begins with
 * Emily 25494
 * Emma 22532
 * Madison 19986
 *  This indicates that Emily was the most popular name with 25,494 registered
 * namings, Emma was the second most popular with 22,532, and Madison was the
 * third most popular with 19,986.
 *  Write a program that reads both the girl and boy files into memory using arrays.
 * Then, allow the user to input a name. The program should search through both
 * arrays. If there is a match, then it should output the popularity ranking and the
 * number of namings. The program should also indicate if there is no match.
 *  For example, if the user enters the name “Justice,” then the program should output
 * Justice is ranked 456 in popularity among girls with 655 namings.
 * Justice is ranked 401 in popularity among boys with 653 namings.
 *  If the user enters the name “Walter,” then the program should output
 * Walter is not ranked among the top 1000 girl names.
 * Walter is ranked 356 in popularity among boys with 775 namings.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner bs = null;
        Scanner gr = null;
        String err = "";
        try{
            err = "boynames.txt";
            bs = new Scanner(new File("boynames.txt"));
            err = "girlnames.txt";
            gr = new Scanner(new File("girlnames.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + err);
            System.exit(1);
        }

        NamePopularity[] boys = new NamePopularity[1000];
        NamePopularity[] girls = new NamePopularity[1000];

        for (int i = 0; i < boys.length; i++){
            if (!bs.hasNextLine()) break;
            String name = bs.next();
            int popularity = bs.nextInt();
//            bs.nextLine();
            boys[i] = new NamePopularity(name, popularity);
        }

        for (int i = 0; i < girls.length; i++){
            if (!gr.hasNextLine()) break;
            String name = gr.next();
            int popularity = gr.nextInt();
//            gr.nextLine();
            girls[i] = new NamePopularity(name, popularity);
        }

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Write name you want to search for");
            String name = sc.nextLine();
            boolean foundAmongBoys = false;
            boolean foundAmongGirls = false;
            for (int i = 0; i < boys.length; i++){
                if (boys[i] == null) break;
                if (boys[i].getName().equalsIgnoreCase(name)) {
                    System.out.println(boys[i].getName() + " is ranked " +
                            (i + 1) + " in popularity among boys with " +
                            boys[i].getPopularity() + " namings.");
                    foundAmongBoys = true;
                    break;
                }
            }
            if (!foundAmongBoys) System.out.println(name + " is not ranked among the top 1000 boys names.");

            for (int i = 0; i < girls.length; i++){
                if (girls[i] == null) break;
                if (girls[i].getName().equalsIgnoreCase(name)) {
                    System.out.println(girls[i].getName() + " is ranked " +
                            (i + 1) + "  in popularity among girls with " +
                            girls[i].getPopularity() + " namings.");
                    foundAmongGirls = true;
                    break;
                }
            }
            if (!foundAmongGirls) System.out.println(name + " is not ranked among the top 1000 girls names.");

            System.out.println("Do you want to search for another name? [y]/[n]");
            if (sc.nextLine().charAt(0) != 'y') break;
        }
    }
}
