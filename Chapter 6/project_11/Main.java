import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirplaneSeats seats = new AirplaneSeats();
        seats.printSeats();

        while (true){
            System.out.println("Input a seat you want to occupy");
            String input = sc.next();
            seats.occupySeat(input);
            seats.printSeats();

            System.out.println("Do you want to continue? (Y/N)");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("Y")){
                break;
            }
        }
    }
}
