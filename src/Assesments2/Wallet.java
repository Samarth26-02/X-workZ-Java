package Assesments2;
class Wallet{
	public static void open(){
		System.out.println("Wallet is open");
		cardDetails();
	}
	public static void close(){
		System.out.println("Wallet is closed");
		moneySpent();
	}
	public static void moneySpent(){
		Perfume.scentType();
	}
	public static void cardDetails(){
		Perfume.applyPerfume();
	}
}