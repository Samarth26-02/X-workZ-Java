package Assesments17.useclasses;

import Assesments17.interfacecs.Student;

public class School {
    Student student;

    public School(Student student){
        this.student=student;
        System.out.println("run student in school..");
    }

    public void execute(){
        if(this.student!=null){
            this.student.study();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
