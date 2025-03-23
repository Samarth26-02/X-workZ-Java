package Assesments4;
class StudentWorks{
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

class Student{
	public static void attendClass(){
		System.out.println("Students has to attend classes");
	}
	public static void study(){
		System.out.println("Students has to study daily");
	}
	public static void writeExams(){
		System.out.println("Students has to write exams");
	}
	public static void submitAssignments(){
		System.out.println("Submit the assignments within the given time");
	}
	public static void checkResult(){
		System.out.println("Check the result");
	}
}