class Bracelet{
	public static void wear(){
		System.out.println("Wear a bracelet");
		price();
	}
	public static void remove(){
		System.out.println("Remove bracelet");
		design();
	}
	public static void design(){
		Wire.connection();
	}
	public static void price(){
		Wire.cable();
	}
}