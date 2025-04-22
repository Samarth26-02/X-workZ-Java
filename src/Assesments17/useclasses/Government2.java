package Assesments17.useclasses;

import Assesments17.interfacecs.Policy;

public class Government2 {
    Policy policy;

    public Government2(Policy policy){
        this.policy=policy;
        System.out.println("run policy in government..");
    }

    public void execute(){
        if(this.policy!=null){
            this.policy.implement();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
