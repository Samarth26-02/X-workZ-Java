class Lipstick{
public static void apply(){
System.out.println("applying lipstick");
checkShade();
}
public static void checkShade(){
	System.out.println("Checking lipstick shade");
	store();
}
public static void buy(){
	System.out.println("Buying lipstick.");
	Brand.brandInfo();
}
public static void store(){
	System.out.println("Storing lipstick.");
	Wallet.moneySpent();
}
}