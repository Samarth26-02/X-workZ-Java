package Assesments3;
class FestivalRunner{
	public static void main(String[] args){
		String name="Pongal";
		int date=17;
		String city="Tamil Nadu";
		Festival festival1=new Festival(name,date,city);
		System.out.println("Festival name is:"+festival1.name);
		System.out.println("Festival date is:"+festival1.date);
		System.out.println("Festival in the city:"+festival1.city);
		
		name="Onam";
		date=26;
		city="Kerala";
		Festival festival2=new Festival(name,date,city);
		System.out.println("Festival name is:"+festival2.name);
		System.out.println("Festival date is:"+festival2.date);
		System.out.println("Festival in the city:"+festival2.city);
		
		name="Holi";
		date=15;
		city="Uttara Pradesh";
		Festival festival3=new Festival(name,date,city);
		System.out.println("Festival name is:"+festival3.name);
		System.out.println("Festival date is:"+festival3.date);
		System.out.println("Festival in the city:"+festival3.city);
		
		name="Dasara";
		date=26;
		city="Karnataka";
		Festival festival4=new Festival(name,date,city);
		System.out.println("Festival name is:"+festival4.name);
		System.out.println("Festival date is:"+festival4.date);
		System.out.println("Festival in the city:"+festival4.city);
		
		name="Ugadi";
		date=30;
		city="Karnataka";
		Festival festival5=new Festival(name,date,city);
		System.out.println("Festival name is:"+festival5.name);
		System.out.println("Festival date is:"+festival5.date);
		System.out.println("Festival in the city:"+festival5.city);
	}
}