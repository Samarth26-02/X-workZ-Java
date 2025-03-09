class Brand{
	public static void brandInfo(){
		System.out.println("This is a premium brand");
		brandCategory();
	}
	public static void brandCategory(){
		System.out.println("This brand falls under cosmetics");
		checkAuthenticity();
	}
	public static void globalReach(){
		System.out.println("It is available in the whole world");
		Gold.investmentValue();
	}
	public static void checkAuthenticity(){
		System.out.println("Checking the authentication");
	}
}