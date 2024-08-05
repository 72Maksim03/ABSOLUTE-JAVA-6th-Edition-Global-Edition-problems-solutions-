/**
 * You have three identical prizes to give away and a pool of 30 finalists. The finalists
 * are assigned numbers from 1 to 30. Write a program to randomly select the numbers of
 * three finalists to receive a prize. Make sure not to pick the same number
 * twice. For example, picking finalists 3, 15, 29 would be valid but picking 3, 3, 31
 * would be invalid because finalist number 3 is listed twice and 31 is not a valid
 * finalist number.
 *
 * @author Maksim Petrosyan
 * */
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random rd = new Random();
        int[] prizeNumbers = new int[3];
        int count = 0;
        outerWhileLoop:
        while(count < 3){
            int randomNumber = rd.nextInt(30) + 1;
            for(int i = 0; i < count; i++){
                if(prizeNumbers[i] == randomNumber){
                    continue outerWhileLoop;
                }
            }
            prizeNumbers[count] = randomNumber;
            count++;
        }
        System.out.println("Numbers of 3 finalists are: " + prizeNumbers[0] + ", " + prizeNumbers[1] + ", "
                + prizeNumbers[2]);
    }
}
