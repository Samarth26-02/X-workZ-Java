package Assesments3;
class CompanyWorks{
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
class Company{
	public static void startMeeting(){
		System.out.println("Start the Meeting");
	}
	public static void sendEmail(){
		System.out.println("Send the email to HR");
	}
	public static void analyzeData(){
		System.out.println("Analyzing the data sent by clint");
	}
	public static void generateReport(){
		System.out.println("Genrate the report");
	}
	public static void scheduleMeeting(){
		System.out.println("Schedule meeting at 2:00PM");
	}
}