package Assesments17.useclasses;

import Assesments17.interfacecs.Employee;

public class Company {
    Employee employee;

    public Company(Employee employee){
        this.employee=employee;
        System.out.println("run employee in company..");
    }

    public void execute(){
        if(this.employee!=null){
            this.employee.work();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
