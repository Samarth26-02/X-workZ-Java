package Assesments;
class ATMs{
	public static void main(String[] args) {
        Bank.openAccount();
        Bank.depositMoney();
        Bank.provideLoan();
        Bank.processTransaction();
        Bank.issueCheck();
        ATM.withdrawCash();
        ATM.checkBalance();
        ATM.printMiniStatement();
        ATM.changePIN();
        ATM.depositCash();
    }
}

