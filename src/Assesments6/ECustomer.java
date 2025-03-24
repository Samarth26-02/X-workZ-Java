package Assesment6;

import Assesment5.BankAccount;

public class ECustomer {
    BankAccount bankaccount=new BankAccount();

    public void ebankDetails(){
        System.out.println(bankaccount.accountNumber);
        System.out.println(bankaccount.bankName);
        bankaccount.showAccountNumber();
        bankaccount.showBankName();
    }
}
