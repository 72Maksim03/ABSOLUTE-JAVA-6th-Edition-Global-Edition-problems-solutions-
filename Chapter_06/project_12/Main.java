import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = {
                "What is the capital of France?",
                "Who wrote the play \"Romeo and Juliet\"?",
                "What is the largest planet in our solar system?",
                "In which year did the Titanic sink?",
                "What is the chemical symbol for gold?"
        };
        String[] answers = {"Paris", "William Shakespeare", "Jupiter", "1912", "Au"};
        int[] points = {1, 2, 2, 3, 3};
        int score = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase(answers[i])){
                score += points[i];
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect. Correct answer is " + answers[i]);
            }
            System.out.println("Score: " + score);
        }
        System.out.println("Game over. Your score is " + score);
    }
}
