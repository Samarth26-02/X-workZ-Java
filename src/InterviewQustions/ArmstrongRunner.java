package InterviewQustions;

public class ArmstrongRunner {
    public static void main(String[] args) {
        ArmstrongNo armstrongNo=new ArmstrongCheck();

        int number=133;
        if(armstrongNo.isArmstrong(number)){
            System.out.println(number+" is an Armstrong number");
        }
        else{
            System.out.println(number+" is not an Armstrong number");
        }
    }
}
