import java.util.Scanner;

/**
 * Modify Programming Project 12 to use a single array instead of three arrays. This
 * can be accomplished by creating a Trivia object that encapsulates the question,
 * answer, and point value for a particular trivia question. Next, create a single array
 * of five Trivia objects instead of three separate arrays for the question, answer,
 * and point values. This change will make your game more scalable if there were
 * ever additional properties to add to a Trivia object (you would not need to add
 * another array for each property). Although the program has internally changed to
 * a single array of objects, the execution of the program should be identical to before.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trivia[] trivia = {
                new Trivia("What is the capital of France?", "Paris", 5),
                new Trivia("Who is the current Prime Minister of the United Kingdom?", "Theresa May", 10),
                new Trivia("What is the name of the largest island in the world?", "Greenland", 8),
                new Trivia("What is the name of the tallest mountain in the world?", "Mount Everest", 12),
                new Trivia("Who was the first woman to win a Nobel Prize?", "Marie Curie", 7)
        };
        int score = 0;

        for(int i = 0; i < trivia.length; i++){
            System.out.println(trivia[i].getQuestion());
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase(trivia[i].getAnswer())){
                score += trivia[i].getPoint();
                System.out.println("Correct");
            } else{
                System.out.println("Incorrect. Correct answer is " + trivia[i].getAnswer());
            }
            System.out.println("Score: " + score);
        }
        System.out.println("Game over. Your score is " + score);
    }
}
