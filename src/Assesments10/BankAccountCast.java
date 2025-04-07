package Assesments10;

public class BankAccountCast {
    public void castBankAccount(BankAccount bankAccount) {
        bankAccount.accountDetails();
        bankAccount.checkBalance();
        bankAccount.area();
        bankAccount.deposit();
        bankAccount.withdraw();

        if (bankAccount instanceof BankAccountDetails) {
            System.out.println("bank account casting");
            BankAccountDetails details = (BankAccountDetails) bankAccount;
            details.branchCode();
        }
    }
}
