/**
 * Write a program that outputs the number of hours, minutes, and seconds that
 * corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
 * and 51 seconds. Test your program with a different number of total seconds to
 * ensure that it works for other cases.
 */
public class Main {
    public static void main(String[] args) {
        int totalSeconds = 50391;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
