/**
 * A common memory matching game played by young children is to start with a
 * deck of cards that contain identical pairs. For example, given six cards in the deck,
 * two might be labeled 1, two labeled 2, and two labeled 3. The cards are shuffled
 * and placed face down on the table. A player then selects two cards that are face
 * down, turns them face up, and if the cards match, they are left face up. If the two
 * cards do not match, they are returned to their original face down position. The
 * game continues until all cards are face up.
 *  Write a program that plays the memory matching game. Use 16 cards that are laid
 * out in a 4  4 square and are labeled with pairs of numbers from 1 to 8. Your
 * program should allow the player to specify the cards that he or she would like to
 * select through a coordinate system.
 *  For example, in the following layout:
 *  1 2 3 4
 *  1 8 * * *
 *  2 * * * *
 *  3 * 8 * *
 *  4 * * * *
 *  all of the face down cards are indicated by *. The pairs of 8 that are face up are at
 * coordinates (1,1) and (2,3). To hide the cards that have been temporarily placed
 * face up, output a large number of newlines to force the old board off the screen.
 *  Hint: Use a 2D array for the arrangement of cards and another 2D array that
 * indicates if a card is face up or face down. Or, a more elegant solution is to create
 * a single 2D array where each element is an object that stores both the card’s value
 * and face. Write a function that “shuffles” the cards in the array by repeatedly selecting
 * two cards at random and swapping them
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}
