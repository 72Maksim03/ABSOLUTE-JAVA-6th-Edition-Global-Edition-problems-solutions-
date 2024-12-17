import java.util.Scanner;

/**
 * Write a program to calculate the average salary of an employee in a company.
 * The program should read the monthly salary and overtime hours of an employee
 * for each of the previous 12 months. The program should then print out a nicely
 * formatted table showing the salary for each of the previous 12 months including
 * salary for overtime hours. It should also show how much above or below average
 * the total salary was for each month. The output should correctly label the months.
 * There are a variety of ways to deal with the month names. One straightforward
 * method is to code the months as integers and then do a conversion to a string for
 * the month name before doing the output. The month input can be handled in any
 * manner you wish so long as it is relatively easy and pleasant for the user.
 *  The salary for the overtime hours is calculated as per the following rates:
 *  a. If salary is above $10,000, then the rate per overtime hour is $25.
 *  b. If salary is greater than $5,000 and below $10,000, then the rate per overtime
 * hour is $20.
 *  c. If salary is greater than $2,000 and below $5,000, then the rate per overtime
 * hour is $15.
 *  If salary is below $2,000, then the rate per overtime hour is $10.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monthly salary");
        int salary = sc.nextInt();
        double[] overtimeHours = new double[months.length];
        for (int i = 0; i < months.length; i++){
            System.out.println("Enter overtime hours for " + months[i]);
            overtimeHours[i] = sc.nextDouble();
        }

        double[] totalSalaries = totalSalaries(salary, overtimeHours);
        double averageSalary = averageSalary(totalSalaries);
        System.out.printf("%10s", "Month");
        System.out.printf("%10s", "Salary");
        System.out.printf("%15s", "Difference");
        for (int i = 0; i < 12; i++){
            System.out.println();
            System.out.printf("%10s", months[i]);
            System.out.printf("%10s", totalSalaries[i]);
            System.out.printf("%15s", (totalSalaries[i] - averageSalary));
        }
    }

    /**
     * Calculates the average salary across all months.
     *
     * @param salaries An array of total salaries for each month
     * @return The average salary
     */
    public static double averageSalary(double[] salaries){
        double sum = 0;
        for (double salary : salaries) sum += salary;
        return sum / salaries.length;
    }

    /**
     * Calculates the total salary for each month based on the base salary and overtime hours.
     * The total salary is calculated by adding the base salary and the overtime pay.
     * Overtime pay is determined by a rate that depends on the base salary.
     *
     * @param salary The base monthly salary
     * @param overtimes An array of overtime hours for each month
     * @return An array of total salaries for each month
     */
    public static double[] totalSalaries(int salary, double[] overtimes){
        double[] salaries = new double[12];
        int rate;
        if (salary > 10000) rate = 25;
        else if(salary > 5000) rate = 20;
        else if(salary > 2000) rate = 15;
        else rate = 10;
        for (int i = 0; i < 12; i++){
            salaries[i] = salary + (overtimes[i] * rate);
        }
        return salaries;
    }
}
