package Assesments10;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.work();
        employee.takeBreak();
        employee.attendMeetings();
        employee.present();
        employee.getSalary();
        System.out.println("-----------------");
        Employee employee1=new Developer();
        employee1.work();
        employee1.takeBreak();
        employee1.attendMeetings();
        employee1.present();
        employee1.getSalary();
    }
}
