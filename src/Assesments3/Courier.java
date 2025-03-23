package Assesments3;
class Courier{
	public static void pickUp(String item){
		System.out.println("invoking send");
		System.out.println(item);
		Station.send(item);
		
	}
}