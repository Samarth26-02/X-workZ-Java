package Assesments10;

public class EmployeeDetails extends Employee{
    @Override
    public void work(){
        System.out.println("Employee works");
    }
    @Override
    public void takeBreak(){
        System.out.println("Employee takes brake");
    }
    @Override
    public void getSalary(){
        System.out.println("Employee gets salary");
    }
    @Override
    public void attendMeetings(){
        System.out.println("Employee attends meeting");
    }
    @Override
    public void present(){
        System.out.println("Employee presents ppt");
    }
    public void submitReports(){
        System.out.println("Employee submits reports");
    }
}