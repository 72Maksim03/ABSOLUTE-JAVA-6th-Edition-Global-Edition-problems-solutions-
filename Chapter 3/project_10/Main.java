/**
 * The game of Pig is a simple two-player dice game in which the first player to
 * reach 100 or more points wins. Players take turns. On each turn, a player rolls a
 * six-sided die:
 *  •  If the player rolls a 1, then the player gets no new points and it becomes the other
 * player’s turn.
 *  •  If the player rolls 2 through 6, then he or she can either
 *  • ROLL AGAIN or
 *  • HOLD. At this point, the sum of all rolls is added to the player’s score, and it
 * becomes the other player’s turn.
 *  Write a program that plays the game of Pig, where one player is a human and the
 * other is the computer. When it is the human’s turn, the program should show the
 * score of both players and the previous roll. Allow the human to input “r” to roll
 * again or “h” to hold.
 *  The computer program should play according to the following rule:
 *  • Keep rolling when it is the computer’s turn until it has accumulated 20 or
 * more points, then hold. If the computer wins or rolls a 1, then the turn ends
 * immediately.
 *  Allow the human to roll first.
 *  
 * @author Maksim Petrosyan
 * */
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int compScore = 0;
        int playerScore = 0;
        System.out.println("The first player to reach 100 or more points wins");
        while(compScore <= 100 && playerScore <= 100){
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            boolean playersTurn = true;
            int temp = 0;
            while(playersTurn){
                System.out.println("Your current score: " + playerScore);
                System.out.println("Oppenent's current score: " + compScore);
                int r = random.nextInt(6) + 1;
                if(r == 1){
                    System.out.println("Rolled a 1! No points for this turn. Switching to computer's turn.");
                    playersTurn = false;
                    temp = 0;
                    System.out.println();
                } else{
                    temp += r;
                    System.out.println("Rolled " + r + ". The score to add to your score is : " + temp);
                    System.out.println("Do you want to roll again? (r/h)");
                    char choice = sc.next().charAt(0);
                    System.out.println();
                    if(choice == 'h'){
                        playersTurn = false;
                        playerScore += temp;
                        temp = 0;
                    }
                }
            }
            while(!playersTurn){
                int r = random.nextInt(6) + 1;
                if(r == 1){
                    playersTurn = true;
                    temp = 0;
                    System.out.println("Switching to player's turn");
                    System.out.println();
                } else{
                    temp += r;
                    if(temp >= 20){
                        playersTurn = true;
                        compScore += temp;
                        temp = 0;
                    }
                }
            }
        }
        if(playerScore >= 100){
            System.out.println("Congratulations, you won");
        } else{
            System.out.println("You lost");
        }
    }
}
