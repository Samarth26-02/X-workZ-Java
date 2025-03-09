class Banks{
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

class Bank {
    public static void openAccount(){
		System.out.println("Opening a bank account");
	}
    public static void depositMoney(){
		System.out.println("Depositing money"); 
	}
    public static void provideLoan(){
		System.out.println("Providing a loan"); 
	}
    public static void processTransaction(){
		System.out.println("Processing bank transaction");
	}
    public static void issueCheck(){ 
		System.out.println("Issuing a check"); 
	}
}