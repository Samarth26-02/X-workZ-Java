package Assesments10;

public class PaymentDetails extends Payment{
    @Override
    public void transaction(){
        System.out.println("Online Transaction");
    }
    @Override
    public void sendAmount(){
        System.out.println("Send amount");
    }
    @Override
    public void recieveAmount(){
        System.out.println("Recieve amount");
    }
    @Override
    public void checkBalance(){
        System.out.println("Check balance");
    }
    @Override
    public void closeApp(){
        System.out.println("Close app");
    }
}
