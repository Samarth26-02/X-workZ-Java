package Assesments17.useclasses;

import Assesments17.interfacecs.Professor;

public class University {
    Professor professor;

    public University(Professor professor){
        this.professor=professor;
        System.out.println("run professor in university..");
    }

    public void execute(){
        if(this.professor!=null){
            this.professor.teach();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
