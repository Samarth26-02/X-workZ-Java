package Assesment6;

import Assesment5.ClassTeacher;

public class SchoolRunner {
    public static void main(String[] args) {
        ClassTeacher classTeacher = new ClassTeacher();
        GuestLecturer guestLecturer = new GuestLecturer();

        classTeacher.StudentDetails();
        guestLecturer.accessStudentDetails();
    }
}
