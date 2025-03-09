class Hospital{
	public static void checkup(String patientName,int age,long mobileNo,String email,String sicknes){
		System.out.println(patientName);
		System.out.println(age);
		System.out.println(mobileNo);
		System.out.println(email);
		System.out.println(sicknes);
		Doctor.treatment(patientName,age);
	}
}