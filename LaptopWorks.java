class LaptopWorks{
	public static void main(String[] args){
		Laptop.powerOn();
		Laptop.openBrowser();
		Laptop.playMusic();
		Laptop.connectWifi();
		Laptop.shutDown();
		Company.startMeeting();
		Company.sendEmail();
		Company.analyzeData();
		Company.generateReport();
		Company.scheduleMeeting();
	}
}

class Laptop{
	public static void powerOn(){
		System.out.println("Laptop is powering on");
	}
	public static void openBrowser(){
		System.out.println("Open browser in laptop");
	}
	public static void playMusic(){
		System.out.println("Music is playing in laptop");
	}
	public static void connectWifi(){
		System.out.println("Connected to wifi");
	}
	public static void shutDown(){
		System.out.println("Laptop is shutting down");
	}
}