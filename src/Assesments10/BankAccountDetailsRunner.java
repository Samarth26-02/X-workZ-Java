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
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountDetails();
        bankAccount.area();
        bankAccount.checkBalance();
        bankAccount.deposit();
        bankAccount.withdraw();
        System.out.println("-----------------");
        BankAccount bankAccount1=new BankAccountDetails();
        bankAccount1.accountDetails();
        bankAccount1.area();
        bankAccount1.checkBalance();
        bankAccount1.deposit();
        bankAccount1.withdraw();
    }
}
