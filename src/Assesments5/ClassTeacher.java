package Assesment5;

public class ClassTeacher {
    Student student = new Student();

    public void StudentDetails() {
        System.out.println("Student name: " + student.name);
        System.out.println("Grade: " + student.grade);
        System.out.println("School name: " + student.schoolName);

        student.showName();
        student.showGrade();
        student.showSchoolName();
    }
}
