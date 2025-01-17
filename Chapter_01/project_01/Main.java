/**
 * Body Mass Index (BMI) helps in specifying the weight category a person
 * belongs to, depending on their body weight. BMI is estimated using the following formula:
 * BMI = Weight in kilograms / (Height in meters)^2
 * Write a program that calculates and outputs the BMI. Assume various input values
 * wherever required.
 */
public class Main {
    public static void main(String[] args) {
        double weight = 75.5;
        double height = 1.72;
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
