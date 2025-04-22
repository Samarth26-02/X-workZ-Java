package Assesments17.useclasses;

import Assesments17.interfacecs.Department;

public class College {
    Department department;

    public College(Department department){
        this.department=department;
        System.out.println("run department in college");
    }

    public void execute(){
        if(this.department!=null){
            this.department.offerCource();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
