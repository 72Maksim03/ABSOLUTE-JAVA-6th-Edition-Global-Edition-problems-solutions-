/**
 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
 * lethal overdose. Write a program with a variable that holds the number of milligrams of
 * caffeine in a drink and outputs how many drinks it takes to kill a person.
 * A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
 * of coffee has approximately 160 mg of caffeine.
 *
 * @author Maksim Petrosyan
 */
public class Main {
    public static final int LETHAL_OVERDOSE = 10000;
    public static final int CAFFEINE_IN_COLA = 34;
    public static final int CAFFEINE_IN_COFFEE = 160;

    public static void main(String[] args) {
        int lethalNumOfCola = LETHAL_OVERDOSE / CAFFEINE_IN_COLA + 1;
        int lethalNumOfCoffee = LETHAL_OVERDOSE / CAFFEINE_IN_COFFEE + 1;
        System.out.println("Lethal number of cola cans: " + lethalNumOfCola);
        System.out.println("Lethal number of coffee cups: " + lethalNumOfCoffee);
    }
}
