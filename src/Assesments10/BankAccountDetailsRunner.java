package Assesments10;

public class BankAccountDetailsRunner {
    public static void main(String[] args) {
        BankAccountDetails bankAccountDetails=new BankAccountDetails();
        bankAccountDetails.accountDetails();
        bankAccountDetails.checkBalance();
        bankAccountDetails.area();
        bankAccountDetails.deposit();
        bankAccountDetails.withdraw();
        System.out.println("-----------------");
        BankAccountDetails bankAccountDetails1=new CustomerDetails();
        bankAccountDetails1.accountDetails();
        bankAccountDetails1.checkBalance();
        bankAccountDetails1.area();
        bankAccountDetails1.deposit();
        bankAccountDetails1.withdraw();
    }
}
