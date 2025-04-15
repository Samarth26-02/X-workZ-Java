package Assesments14;

public class Manager extends Employee{
    Manager(String name,int idNo,double salary){
        super(name,idNo,salary);
    }

    void dispaly(){
        System.out.println("Name:"+name+"IDNo:"+idNo+"Salary:"+salary);
    }
}
