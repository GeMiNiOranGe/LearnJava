import oop.*;
import basic.*;

public class Main {
    public static void main(String[] args) {
        // BasicArray.showArray1D();
        // System.out.println();
        // BasicArray.showArray2D();
        // ===============================================================================

        // String result = Helper.alternateString("Hello world", " ");
        // System.out.println(result);
        // ===============================================================================

        Student student = new Student("Mike", 25, 1.8f, "Harvard");
        System.out.println("Current student:\n " + student.getInfo());
        System.out.println();

        Student newStudent = student.clone();
        newStudent.setName("Alex");
        newStudent.setHeight(1.55f);

        System.out.println("New student:\n " + newStudent.getInfo());
        System.out.println();
        System.out.println("Current student:\n " + student.getInfo());
        System.out.println();
        // ===============================================================================
    }
}