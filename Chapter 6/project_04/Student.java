public class Student {
    private String name;
    private String studentId;
    private int[] marks;
    private int lastEl;

    public Student(String name, String studentId, int[] marks){
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
        this.lastEl = marks.length - 1;
    }

    public void validateMarks(){
        for(int i = marks.length - 1; i >= 0; i--){
            if (marks[i] < 0 || marks[i] > 100){
                for (int j = i; j <= lastEl - 1; j++) marks[j] = marks[j+1];
                lastEl--;
            }
        }
    }

    public void printMarks(){
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.print("Marks: ");
        for (int i = 0; i <= lastEl; i++) System.out.print(marks[i] + " ");
        System.out.println();
    }
}
