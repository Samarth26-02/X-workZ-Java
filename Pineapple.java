class Pineapple{
	public static void peel(){
		System.out.println("Peeling the pineapple");
		cut();
	}
	public static void cut(){
		System.out.println("Cut the Pineapple");
	}
	public static void eat(){
		TrafficSignal.showYellow();
	}
	public static void juice(){
		Lipstick.store();
	}
}