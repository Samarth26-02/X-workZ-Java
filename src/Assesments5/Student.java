package Assesment5;

public class Student {
    public String name = "Alice";
    int grade = 10;
    private int studentID = 5678;
    public String schoolName = "Springfield High";

    public void showName() {
        System.out.println("Student Name: " + name);
    }

    void showGrade() {
        System.out.println("Grade: " + grade);
    }

    private void showStudentID() {
        System.out.println("Student ID: " + studentID);
    }

    public void showSchoolName() {
        System.out.println("School Name: " + schoolName);
    }
}
