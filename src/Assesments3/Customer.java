package Assesments3;
class Customer{
	public static void buy(String vegetable,int quantity){
		System.out.println(vegetable);
		System.out.println(quantity);
		Shop.sell(vegetable,quantity);
	}
}