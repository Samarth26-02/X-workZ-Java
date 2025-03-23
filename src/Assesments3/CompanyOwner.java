package Assesments3;
class CompanyOwner{
	public static String getOwner(String company) {
        if (company == "Tesla") {
            return "Elon Musk";
        } 
		else if (company == "Amazon") {
            return "Jeff Bezos";
        } 
		else if (company == "Microsoft") {
            return "Bill Gates";
        } 
		else if (company == "Facebook") {
            return "Mark Zuckerberg";
        } 
		else if (company == "Google") {
            return "Larry Page & Sergey Brin";
        } 
		else if (company == "Apple") {
            return "Steve Jobs";
        } 
		else if (company == "SpaceX") {
            return "Elon Musk";
        } 
		else if (company == "Reliance") {
            return "Mukesh Ambani";
        } 
		else if (company == "Tata") {
            return "Ratan Tata";
        } 
		else if (company == "Infosys") {
            return "Narayana Murthy";
        } 
		else if (company == "Wipro") {
            return "Azim Premji";
        } 
		else if (company == "Adani Group") {
            return "Gautam Adani";
        }
            return "Unknown Owner";
    }
}