//armstrong numbers

package InterviewQustions;

public class ArmstrongRunner {
    public static void main(String[] args) {
        ArmstrongNo armstrongNo=new ArmstrongCheck();

        int number=153;//Armstrong numbers are:1,153,370,371,407,1634,8208,9474
        if(armstrongNo.isArmstrong(number)){
            System.out.println(number+" is an Armstrong number");
        }
        else{
            System.out.println(number+" is not an Armstrong number");
        }
    }
}
