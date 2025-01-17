public class Trivia {
    private String question;
    private String answer;
    private int point;

    public Trivia(String question, String answer, int point){
        this.question = question;
        this.answer = answer;
        this.point = point;
    }

    public String getQuestion(){return question;}
    public String getAnswer(){return answer;}
    public int getPoint(){return point;}
}
