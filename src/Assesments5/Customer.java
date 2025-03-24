package Assesment5;

public class Customer {
    BankAccount bankaccount=new BankAccount();

    public void bankDetails(){
        System.out.println(bankaccount.accountNumber);
        System.out.println(bankaccount.balance);
        System.out.println(bankaccount.bankName);
        bankaccount.showAccountNumber();
        bankaccount.showBalance();
        bankaccount.showBankName();
    }
}
