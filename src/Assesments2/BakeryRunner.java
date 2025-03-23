package Assesments2;
class BakeryRunner{
	public static void main(String[] args){
		String itemName="Samosa";
		int quantity=5;
		Bakery.buy(itemName,quantity);
		
		boolean opened=true;
		Bakery.open(opened);
		
		boolean closed=false;
		Bakery.close(closed);
		
		String nameOfOwner="ABC";
		Bakery.owner(nameOfOwner);
		
		String nameOfCashier="XYZ";
		Bakery.cashier(nameOfCashier);
	}
}