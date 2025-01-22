import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TopPlayers {
    private String[] names = new String[5];
    private int[] scores = new int[5];
    private String fileName;

    public TopPlayers(){
        this("tops.txt");
    }

    public TopPlayers(String fileName){
        this.fileName = fileName;
        File tops = new File(fileName);
        if (!tops.exists()){
            System.out.println("File does not exist. Creating file...");
            PrintWriter pw = null;

            try{
                pw = new PrintWriter(tops);
            } catch (FileNotFoundException e){
                System.out.println("Error opening file");
                System.exit(1);
            }

            for (int i = 0; i < scores.length; i++){
                pw.println("");
                pw.println(0);
            }

            pw.close();
        }
        getDataFromFile(tops);
        sort();
    }

    private void getDataFromFile(File file){
        try{
            Scanner sc = new Scanner(file);
            for (int i = 0; i < scores.length; i++){
                names[i] = sc.nextLine();
                scores[i] = sc.nextInt();
                sc.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }
    }

    public String getIthPlayerName(int i) throws IllegalArgumentException{
        if (i < 1 || i > scores.length) throw new IllegalArgumentException("Invalid input. Enter number between 1 and 5 inclusive");
        return names[i - 1];
    }

    public int getIthScore(int i) throws IllegalArgumentException{
        if (i < 1 || i > scores.length) throw new IllegalArgumentException("Invalid input. Enter number between 1 and 5 inclusive");
        return scores[i - 1];
    }

    public String getPlayerWithScore(int i) throws IllegalArgumentException{
        return ("Player: " + getIthPlayerName(i) + "\nScore: " + getIthScore(i));
    }

    public String[] getTopNames(){return names;}
    public int[] getTopScores(){return scores;}
    public void setPlayer(int i, String name) throws IllegalArgumentException{
        if (i < 1 || i > scores.length) throw new IllegalArgumentException("Invalid input. Enter number between 1 and 5 inclusive");
        names[i - 1] = name;
        write();
    }
    public void setScores(int i, int score) throws IllegalArgumentException{
        if (i < 1 || i > scores.length) throw new IllegalArgumentException("Invalid input. Enter number between 1 and 5 inclusive");
        scores[i - 1] = score;
        sort();
        write();
    }

    public void playerScore(String name, int score){
        if (scores[scores.length - 1] < score){
            setPlayer(scores.length, name);
            setScores(scores.length, score);
        }
    }

    private void sort(){
        for (int i = 0; i < scores.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < scores.length - i - 1; j++){
                if (scores[j] < scores[j + 1]){
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private void write(){
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new File(fileName));
        } catch (FileNotFoundException e){
            System.out.println("Error updating file");
            System.exit(0);
        }
        for (int i = 0; i < scores.length; i++){
            pw.println(names[i]);
            pw.println(scores[i]);
        }
        pw.close();
    }
}
