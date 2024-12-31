import java.util.Scanner;
/**
 * . Write a program that manages a list of up to 10 players and their high scores in the
 * computer’s memory (not on disk for this Programming Project). Use two arrays
 * to manage the list. One array should store the players’ names, and the other array
 * should store the players’ high scores. Use the index of the arrays to correlate the
 * names with the scores. Your program should support the following features:
 * a. Add a new player and score (up to 10 players).
 * b. Print all the players’ names and their scores to the screen.
 * c. Allow the user to enter a player’s name and output that player’s score or a message if that player’s name has not been entered.
 * d. Allow the user to enter a player’s name and remove the player from the list.
 *  Create a menu system that allows the user to select which option to invoke
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        int[] scores = new int[10];
        int numOfPlayers = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the letter of the action you want to do");
            System.out.println("a. Add a new player and score");
            System.out.println("b. Print all the players’ names and their scores to the screen.");
            System.out.println("c. Search for the player");
            System.out.println("d. Remove a player");
            System.out.println("e. Exit");

            char choice = sc.nextLine().charAt(0);
            if (choice == 'a'){
                if (numOfPlayers == 10) {
                    System.out.println("Maximum number of players. Can not add new");
                    continue;
                }
                System.out.println("Enter a new player's name");
                String name = sc.nextLine();
                System.out.println("Enter a new player's score");
                int score;
                try {
                    score = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer for the score.");
                    sc.nextLine();
                    continue;
                }
                names[numOfPlayers] = name;
                scores[numOfPlayers] = score;
                numOfPlayers++;
            } else if (choice == 'b'){
                if (numOfPlayers == 0) System.out.println("No player found");
                printPlayers(names, scores, numOfPlayers);
            } else if (choice == 'c'){
                System.out.println("Enter player's name");
                String name = sc.nextLine();
                int index = searchPlayer(names, numOfPlayers, name);
                if (index != -1) System.out.println(names[index] + ": " + scores[index]);
                else System.out.println("Player not found");
            } else if (choice == 'd'){
                System.out.println("Enter name of the player you want to remove");
                String name = sc.nextLine();
                int index = searchPlayer(names, numOfPlayers, name);
                if (index!= -1) {
                    System.out.println("Player " + names[index] + " is removed");
                    for (int j = index; j < numOfPlayers; j++){
                        names[j] = names[j+1];
                        scores[j] = scores[j+1];
                    }
                    numOfPlayers--;
                } else{
                    System.out.println("Player not found");
                }
            } else if (choice == 'e') break;
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void printPlayers(String[] players, int[] scores, int numOfPlayers){
        for (int i = 0; i < numOfPlayers; i++){
            System.out.println(players[i] + ": " + scores[i]);
        }
    }

    public static int searchPlayer(String[] players, int numOfPlayers, String name){
        for (int i = 0; i < numOfPlayers; i++)
            if (players[i].equals(name)) return i;

        return -1;
    }
}
