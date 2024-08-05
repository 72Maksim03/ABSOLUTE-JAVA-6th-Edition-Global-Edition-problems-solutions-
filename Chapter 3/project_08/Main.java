/**
 * In a certain code language, numerals are each represented by a symbol or a letter.
 * They are as follows
 * Numeral 0 1 2 3 4 5 6 7 8 9
 * Symbol code * B E A @ F K % R M
 *  Numerals are to be coded as per the codes in the table and the following conditions:
 *  a. If the first and the last digits are odd, both are to be coded as ‘X’.
 *  b. If the first and the last digits are even, both are to be coded as ‘$’.
 *  c. If the last digit is ‘0’, it is to be coded as ‘#’.
 *  For example, 487692 is coded as $R%KM$
 *  Write a program that takes as input a sequence of numbers and displays the corresponding code to represent it.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        String value = num + "";
        String codedNum = "";
        while(num > 0){
            int digit = num % 10;
            num = num / 10;
            String codedDigit;
            switch (digit){
                case 0:
                    codedDigit = "*";
                    break;
                case 1:
                    codedDigit = "B";
                    break;
                case 2:
                    codedDigit = "E";
                    break;
                case 3:
                    codedDigit = "A";
                    break;
                case 4:
                    codedDigit = "@";
                    break;
                case 5:
                    codedDigit = "F";
                    break;
                case 6:
                    codedDigit = "K";
                    break;
                case 7:
                    codedDigit = "%";
                    break;
                case 8:
                    codedDigit = "R";
                    break;
                case 9:
                    codedDigit = "M";
                    break;
                default:
                    codedDigit = "";
                    break;
            }
            codedNum = codedDigit + codedNum;
        }
        int lastDigit = Integer.parseInt(value.charAt(0) + "");
        int firstDigit = Integer.parseInt(value.charAt(value.length() - 1) + "");
        if(firstDigit == 0){
            codedNum = codedNum.substring(0, codedNum.length() - 1) + "#";
        } else if(firstDigit % 2 == 0 && lastDigit % 2 == 0){
            codedNum = "$" + codedNum.substring(1, codedNum.length() - 1) + "$";
        } else if(firstDigit % 2 != 0 && lastDigit % 2 != 0){
            codedNum = "X" + codedNum.substring(1, codedNum.length() - 1) + "X";
        }
        System.out.println("The coded representation of " + num + " is " + codedNum);
    }
}
