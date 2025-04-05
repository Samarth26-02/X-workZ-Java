// EnrollmentRunner.java
package Assesments10;

public class EnrollmentRunner {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        enrollment.enrollStudent();
        enrollment.withdrawStudent();
        enrollment.viewRoster();
        enrollment.assignGrade();
        enrollment.generateReport();

        System.out.println("----------------------");

        Enrollment enrollment1 = new EnrollmentDetails();
        enrollment1.generateReport();
        enrollment1.assignGrade();
        enrollment1.viewRoster();
        enrollment1.withdrawStudent();
        enrollment1.enrollStudent();

        System.out.println("----------------------");

        EnrollmentDetails enrollmentDetails = new EnrollmentDetails();
        enrollmentDetails.enrollStudent();
        enrollmentDetails.generateReport();
        enrollmentDetails.assignGrade();
        enrollmentDetails.viewRoster();
        enrollmentDetails.withdrawStudent();
    }
}