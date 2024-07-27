/**
 * A designer is trying to create a new pattern of five stripes using three colors. These
 * colors and their codes are mentioned in the table below.
 * Color Character Code
 * Red     R
 * Green   G
 * Blue    B
 *  The designer has to keep in mind that no two adjacent stripes are of the same color.
 * For example, RRGBR is an invalid pattern, but RGBRB is valid.
 *  Write a program that accepts a sequence of five colors as input from the designer to
 * form the pattern. At each selection the designer makes, the program should check if
 * the input is from among the available set of colors. Also, the program should check
 * that adjacent colors are not the same. At the end, the program should display the
 * final stripe pattern created.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char input;
        String res = "";
        int i = 0;
        while(i < 5){
            System.out.println("Choose a color [R, G, B]");
            input = sc.next().charAt(0);
            if(input != 'R' && input != 'G' && input != 'B'){
                System.out.println("You should choose one of these colors [R, G, B]");
                continue;
            }
            if((i != 0) && (input == res.charAt(i - 1))){
                System.out.println("Two adjacent stripes should not be the same color");
                System.out.println("Current pattern is \"" + res + "\"");
                continue;
            }
            res += input;
            System.out.println("Current pattern is \"" + res + "\"");
            i++;
        }
        System.out.println("Your pattern is \"" + res + "\"");
    }
}
