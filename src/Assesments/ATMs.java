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

class ATM{
	public static void withdrawCash(){
		System.out.println("Withdrawing cash from ATM"); 
	}
    public static void checkBalance(){ 
		System.out.println("Checking account balance"); 
	}
    public static void printMiniStatement(){
		System.out.println("Printing mini statement"); 
	}
    public static void changePIN(){
		System.out.println("Changing ATM PIN"); 
	}
    public static void depositCash(){
		System.out.println("Depositing cash into ATM"); 
	}
}