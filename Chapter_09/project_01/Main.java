import java.util.Scanner;
/**
 * Write a program that calculates the average of N integers. The program should
 * prompt the user to enter the value for N and then afterward must enter all N
 * numbers. If the user enters a nonpositive value for N, then an exception should be
 * thrown (and caught) with the message “N must be positive.” If there is any exception
 * as the user is entering the N numbers, an error message should be displayed,
 * and the user prompted to enter the number again.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Average is " + average(sc));
    }

    public static double average(Scanner sc){
        int N = 0;
        try{
            System.out.println("Enter the number of integers");
            N = sc.nextInt();
            if (N <= 0) throw new NegativeNumberException("N must be positive");
        } catch (NegativeNumberException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }catch (Exception e){
            System.out.println("N must be integer");
            System.exit(0);
        }
        return calculateAverage(N);
    }

    public static double calculateAverage(int N){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < N; i++){
            System.out.println("Enter integer");
            try{
                int num = sc.nextInt();
                sum += num;
            } catch (Exception e){
                System.out.println("Number should be integer");
                System.out.println("Enter the number again");
                sc.nextLine();
                i--;
            }
        }
        return sum / N;
    }
}
