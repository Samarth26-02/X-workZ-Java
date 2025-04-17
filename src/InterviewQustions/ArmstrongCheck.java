package InterviewQustions;

public class ArmstrongCheck implements ArmstrongNo{
    @Override
    public boolean isArmstrong(int number){
        int sum=0, temp=number;
        int digits=String.valueOf(number).length();

        while(temp!=0){
            int digit=temp%10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }
        return sum==number;
    }
}
