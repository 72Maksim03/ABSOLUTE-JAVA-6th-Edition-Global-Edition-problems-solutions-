/**
 * John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
 * a program to calculate the total number of hours John takes to cover this distance.
 * The program should print the total time taken in hours and minutes.
 * Use the following formula for calculations.
 * Time = Distance / Speed
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args){
        int distance = 55;
        int speed = 15;
        int timeInHours = distance / speed;
        int timeInMinutes = (distance % speed) * 60 / speed;
        System.out.println("The total time taken to cover the distance is " + timeInHours + " hours and "
        + timeInMinutes + " minutes");
    }
}
