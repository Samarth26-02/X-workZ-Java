package Assesments3;
class HospitalWorks{
	public static void main(String[] args){
		Hospital.admitPatient();
		Hospital.provideEmergencyCare();
		Hospital.manageRecords();
		Hospital.conductSurgery();
		Hospital.dischargePatient();
		
		Doctor.illeness();
		Doctor.medicine();
		Doctor.checkReports();
		Doctor.performSurgery();
		Doctor.consultPatient();
		}
}
class Hospital{
	public static void admitPatient(){
		System.out.println("Patients are admitted");
	}
	public static void provideEmergencyCare(){
		System.out.println("Emergency care is provided");
	}
	public static void manageRecords(){
		System.out.println("The records are managed");
	}
	public static void conductSurgery(){
		System.out.println("Surgeries are conducted");
	}
	public static void dischargePatient(){
		System.out.println("PAtients are discharged");
	}
}