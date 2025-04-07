package Assesments10;

public class EmployeeCast {
    public void castEmployee(Employee employee) {
        employee.work();
        employee.takeBreak();
        employee.getSalary();
        employee.attendMeetings();
        employee.present();

        if (employee instanceof EmployeeDetails) {
            System.out.println("Casting to EmployeeDetails...");
            EmployeeDetails details = (EmployeeDetails) employee;
            details.submitReports();
        }
    }
}