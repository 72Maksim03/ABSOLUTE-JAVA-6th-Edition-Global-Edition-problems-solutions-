/**
 * An Armstrong number is an n-digit number that equals the sum of the nth power
 * of its digits. For example 153 is a three-digit number where the sum of the cubes
 * of the individual digits (1^3 + 5^3 + 3^3) equals the number itself (153).
 *  Write a program that takes as input the start and end numbers of an Armstrong
 * number range to be printed. Your program should prompt for new start and end
 * numbers until the user decides that she or he is through. Use variables of the type
 * integer to store the start and end numbers of the range.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Input the Armstrong number range to be printed ");
            System.out.println("Input the start number");
            int start = sc.nextInt();
            System.out.println("Input the end number");
            int end = sc.nextInt();
            boolean check = true;
            for(int i = start; i <= end; i++){
                int digits = 0;
                int temp = i;
                while(temp > 0){
                    temp /= 10;
                    digits++;
                }
                int sum = 0;
                temp = i;
                while(temp > 0){
                    int rem = temp % 10;
                    temp = temp / 10;
                    sum = sum + (int)Math.pow(rem, digits);
                }
                if(sum == i){
                    System.out.println(i + " is Armstrong number");
                    check = false;
                }
            }
            if(check){
                System.out.println("In this range there are no Armstrong numbers");
            }

            System.out.println("Quit, Continue? (Q/C)");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("Q")){
                break;
            }
        }
    }
}
