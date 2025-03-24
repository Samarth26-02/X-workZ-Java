package Assesment6;

import Assesment5.Student;

public class GuestLecturer {
    Student student = new Student();

    void accessStudentDetails() {
        System.out.println("Student name: " + student.name);
        System.out.println("School name: " + student.schoolName);

        student.showName();
        student.showSchoolName();
    }
}
