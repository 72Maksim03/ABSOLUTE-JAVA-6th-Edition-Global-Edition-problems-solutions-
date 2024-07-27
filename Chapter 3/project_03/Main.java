/**
 * Weight is defined as the gravitational force acting on the mass of a body. The
 * weight of a body with a mass of 1kg on Earth can be calculated with the formula
 * given below. The weight is expressed in Newtons (N).
 * Weight on earth = (1 kg) * (9.81 m/s2) = 9.81 N
 *  The weight of the same body in N can be calculated with another formula:
 * Weight on moon = ((1 kg) * (9.81 m/s2)) / 6 = 1.64 N
 *  Write a program that takes as input the mass of a car in kilograms and then prompts
 * the user to choose to calculate the car’s weight in Newtons either on Earth or on
 * the Moon. The program should allow the user to enter new values and output the
 * car’s weight on Earth or on the Moon till the user decides to exit. Use the double
 * data type to store the mass.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        while(true){
            System.out.println("Enter mass in kilograms");
            double mass = sc.nextDouble();
            System.out.println("on Moon or Earth M/E: ");
            char choice = sc.next().toUpperCase().charAt(0);
            double weight;
            String planet;
            if(choice == 'E'){
                weight = mass * 9.81;
                planet = "Earth";
            } else if(choice == 'M'){
                weight = mass * 9.81 / 6;
                planet = "Moon";
            } else {
                System.out.println("Please enter M for choosing moon or enter E for choosing Earth");
                continue;
            }
            String formattedWeight = df.format(weight);
            System.out.println("Weight on " + planet + " is " + formattedWeight + " Newton");
            System.out.println("If you want to exit enter Q. If you want to continue, enter C");
            char ex = sc.next().toUpperCase().charAt(0);
            if(ex == 'Q'){
                break;
            }
        }
    }
}
