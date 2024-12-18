/**
 * Write a program to document the marks of an additional value added course taught
 * to the students. The marks of the students cannot be negative and cannot be more
 * than 100 i.e. 0<=marks<=100. Create a class that should maintain the following
 * information about each student of the class.
 *  a. Student name
 *  b. Student ID
 *  c. Array of marks in five subjects
 *  Also, write a method called validateMarks that deletes all the marks less than zero
 * and greater than 100 from the array. When a value of marks is deleted, the remaining marks are moved one position to fill in the gap. This creates empty positions
 * at the end of the array so that less of the array is used. For example, consider the
 * following given array:
 *  intarrMarks [] = new int[5];
 *  arrMarks [0] = 10;
 *  arrMarks [1] = –15;
 *  arrMarks [2] = 25;
 *  arrMarks [3] = 102;
 *  arrMarks [4] = 30;
 *  After execution of validateMarks, the value of arrMarks [0] is 10, the value of
 * arrMarks [1] is –15, the value of arrMarks [2] is 30, the value of arrMarks [3] is
 * 102 and the value of arrMarks [4] is 30 and the value of length is 5. (The value of
 * arrMarks [1] and arrMarks [3] is no longer of any concern, because the partially
 * filled array no longer uses this indexed variable). Write a suitable test program for
 * your method.
 *
 * @author Maksim Petrosyan
 * */

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student1", "ID1", new int[] {100, 96, 48, -9, 10});
        Student student2 = new Student("Student2", "ID2", new int[] {95, 88, 92, 90, 80});
        Student student3 = new Student("Student3", "ID3", new int[] {195, -88, 92, 90, 80});

        student1.validateMarks();
        student2.validateMarks();
        student3.validateMarks();

        student1.printMarks();
        student2.printMarks();
        student3.printMarks();
    }
}
