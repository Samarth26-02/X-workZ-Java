class Wire{
	public static void electricityFlow(){
		System.out.println("Electricity flows through wire");
		connection();
	}
	public static void insulationCheck(){
		System.out.println("Check wire insulation");
		electricityFlow();
		
	}
	public static void connection(){
		Gold.exchange();
	}
	public static void cable(){
		TrafficSignal.showRed();

	}
}