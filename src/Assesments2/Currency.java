package Assesments2;
class Currency{
	public static void exchangeRate(){
		System.out.println("Check currency exchange rate");
		convertToGold();
	}
	public static void currentValue(){
		System.out.println("Current value of currency is...");
		digitalPayment();
	}
	public static void convertToGold(){
		Wallet.open();
	}
	public static void digitalPayment(){
		Wallet.close();
	}
}