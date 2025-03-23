package Assesments4;
class Schools{
	public static void main(String[] args){
		School.conductClass();
		School.conductExams();
		School.provideResult();
		School.giveHomeworks();
		School.collectFees();
		Student.attendClass();
		Student.study();
		Student.writeExams();
		Student.submitAssignments();
		Student.checkResult();
	}
}

class School{
	public static void conductClass(){
		System.out.println("Teachers conduct classes");
	}
	public static void conductExams(){
		System.out.println("Exams are conducted to check the knowledge of students");
	}
	public static void provideResult(){
		System.out.println("Results are provided");
	}
	public static void giveHomeworks(){
		System.out.println("Homeworks are given to students");
	}
	public static void collectFees(){
		System.out.println("Fees are collected");
	}
}