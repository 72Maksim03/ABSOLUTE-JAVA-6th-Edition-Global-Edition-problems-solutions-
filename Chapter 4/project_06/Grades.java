public class Grades {
    private double quizz1, quizz2, quizz3;
    private double midterm1, midterm2;
    private double finalExam;
    private int finalGrade;
    private char finalGradeChar;

    public Grades(String quizzes, String midterms, double finalExam) {
        String[] qz = quizzes.split(" ");
        this.quizz1 = Double.parseDouble(qz[0]);
        this.quizz2 = Double.parseDouble(qz[1]);
        this.quizz3 = Double.parseDouble(qz[2]);
        String[] mt = midterms.split(" ");
        this.midterm1 = Double.parseDouble(mt[0]);
        this.midterm2 = Double.parseDouble(mt[1]);
        this.finalExam = finalExam;
        this.calculateFinalGrade();
        this.setFinalGradeChar();
    }

    public void calculateFinalGrade(){
        double quizzAverage = 10 * (quizz1 + quizz2 + quizz3) / 3;
        double midtermsAverage = (midterm1 + midterm2) / 2;
        double weightedAverage = (quizzAverage * 0.25) + (midtermsAverage * 0.35) + (finalExam * 0.4);
        this.finalGrade = (int) Math.round(weightedAverage);
    }

    private void setFinalGradeChar(){
        if(this.finalGrade >= 90){
            this.finalGradeChar = 'A';
        } else if(this.finalGrade >= 80){
            this.finalGradeChar = 'B';
        } else if(this.finalGrade >= 70){
            this.finalGradeChar = 'C';
        } else if(this.finalGrade >= 60){
            this.finalGradeChar = 'D';
        } else {
            this.finalGradeChar = 'F';
        }
    }

    public String toString(){
        String res = "Your records are: " + "\n" +
                "Quizzes: " + quizz1 + ", " + quizz2 + ", " + quizz3 + "\n" +
                "Midterms: " + midterm1 + ", " + midterm2 + "\n" +
                "Final Exam: " + finalExam + "\n" +
                "Final Grade: " + this.finalGrade + ", " + this.finalGradeChar;
        return res;
    }
}
