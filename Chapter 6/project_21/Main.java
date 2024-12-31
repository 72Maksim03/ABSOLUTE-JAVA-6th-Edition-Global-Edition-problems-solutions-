import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[10];
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
                players[numOfPlayers] = new Player(name, score);
                numOfPlayers++;
            } else if (choice == 'b'){
                if (numOfPlayers == 0) System.out.println("No player found");
                printPlayers(players, numOfPlayers);
            } else if (choice == 'c'){
                System.out.println("Enter player's name");
                String name = sc.nextLine();
                int index = searchPlayer(players, numOfPlayers, name);
                if (index != -1) System.out.println(players[index].getName() + ": " + players[index].getScore());
                else System.out.println("Player not found");
            } else if (choice == 'd'){
                System.out.println("Enter name of the player you want to remove");
                String name = sc.nextLine();
                int index = searchPlayer(players, numOfPlayers, name);
                if (index!= -1) {
                    System.out.println("Player " + players[index].getName() + " is removed");
                    for (int j = index; j < numOfPlayers; j++){
                        players[j] = players[j+1];
                    }
                    players[numOfPlayers] = null;
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

    public static void printPlayers(Player[] players, int numOfPlayers){
        for (int i = 0; i < numOfPlayers; i++){
            System.out.println(players[i].getName() + ": " + players[i].getScore());
        }
    }

    public static int searchPlayer(Player[] players, int numOfPlayers, String name){
        for (int i = 0; i < numOfPlayers; i++)
            if (players[i].getName().equals(name)) return i;

        return -1;
    }
}