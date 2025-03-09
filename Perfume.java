class Perfume{
	public static void applyPerfume(){
		System.out.println("Applying perfume");
		type();
	}
	public static void scentType(){
		System.out.println("Perfume is gas");
		test();
	}
	public static void test(){
		Bracelet.wear();
	}
	public static void type(){
		Bracelet.remove();
	}
}