package Assesments10;

public class EnrollmentCast {
    public void castEnrollment(Enrollment enrollment) {
        enrollment.enrollStudent();
        enrollment.withdrawStudent();
        enrollment.viewRoster();
        enrollment.assignGrade();
        enrollment.generateReport();

        if (enrollment instanceof EnrollmentDetails) {
            System.out.println("Casting to EnrollmentDetails...");
            EnrollmentDetails details = (EnrollmentDetails) enrollment;
            details.sendConfirmation();
        }
    }
}