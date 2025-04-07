package Assesments10;

public class BankAccountDetails extends BankAccount {
    @Override
    public void deposit() {
        System.out.println("Deposit the 20000 money");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw the 3000 money");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check account balance");
    }

    @Override
    public void accountDetails() {
        System.out.println("Account details");
    }

    @Override
    public void area() {
        System.out.println("Area of Bank:Bangalore");
    }

    public void branchCode() {
        System.out.println("Branch Code: SBI1234");
    }
}
