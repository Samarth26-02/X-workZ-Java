package Assesments3;
class Doctor{
	public static void treatment(String patientName,int age){
		System.out.println(patientName);
		System.out.println(age);
		Nurse.assist(patientName);
	}
}