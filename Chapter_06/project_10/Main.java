import java.util.Scanner;
/**
 * Write a program to simulate a simple game using arrays. The program should
 * create a grid of stars using 2D arrays for the user to move in. When the program
 * is started, the user’s current position should be generated randomly in row and
 * column format. It should then ask the user for the movement selection, i.e., left,
 * right, up, and down. The program should then reprint the grid with the old location
 * of user replaced with a $ symbol and the new location with an N symbol. The
 * program displays the game positions as follows:
 *  * * *
 *  * * *
 *  * * *
 *  A sample grid configuration is
 *  * * *
 *  $ N *
 *  * * *
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        game.printGrid();

        while(true){
            System.out.println("Enter your move");
            String move = sc.next();
            if (move.equalsIgnoreCase("quit")) break;

            game.move(move);
            game.printGrid();
        }
    }
}
