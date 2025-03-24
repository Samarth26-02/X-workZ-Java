package Assesment5;

public class BankAccount {
    public String accountNumber="123456789";
    int balance=23000;
    private int pin=123;
    public String bankName="RBI";

    public void showAccountNumber(){
        System.out.println("Account number:"+accountNumber);

    }
    void showBalance(){
        System.out.println("Bank balance:"+balance);
    }
    private void showPIN(){
        System.out.println("Bank pin:"+pin);
    }
    public void showBankName(){
        System.out.println("Bank name:"+bankName);
    }
}
