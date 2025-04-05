// EnrollmentDetails.java
package Assesments10;

public class EnrollmentDetails extends Enrollment {
    @Override
    public void enrollStudent() {
        System.out.println("Enrolling student with details");
    }

    @Override
    public void withdrawStudent() {
        System.out.println("Withdrawing student with details");
    }

    @Override
    public void viewRoster() {
        System.out.println("Viewing detailed class roster");
    }

    @Override
    public void assignGrade() {
        System.out.println("Assigning detailed grade");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating detailed enrollment report");
    }
}