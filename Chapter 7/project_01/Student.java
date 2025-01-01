public class Student extends Person{
    private String studentId;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, String studentId, String course, String teacherName){
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    public String getStudentId(){return this.studentId;}
    public String getCourse(){return this.course;}
    public String getTeacherName(){return this.teacherName;}
    public void setStudentId(String studentId){this.studentId = studentId;}
    public void setCourse(String course){this.course = course;}
    public void setTeacherName(String teacherName){this.teacherName = teacherName;}

    public String displayDetails(){
        return "Student " + super.displayDetails() +
                "\nStudent ID: " + studentId +
                "\nCourse: " + course +
                "\nTeacher Name: " + teacherName;
    }
}
