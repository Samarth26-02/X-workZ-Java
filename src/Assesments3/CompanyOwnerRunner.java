package Assesments3;
class CompanyOwnerRunner{
	public static void main(String[] args){
		System.out.println("Company Tesla:"+CompanyOwner.getOwner("Tesla"));
        System.out.println(CompanyOwner.getOwner("Amazon"));
        System.out.println(CompanyOwner.getOwner("Microsoft"));
        System.out.println(CompanyOwner.getOwner("Facebook"));
        System.out.println(CompanyOwner.getOwner("Google"));
        System.out.println(CompanyOwner.getOwner("Apple"));
        System.out.println(CompanyOwner.getOwner("SpaceX"));
        System.out.println(CompanyOwner.getOwner("Reliance"));
        System.out.println(CompanyOwner.getOwner("Tata"));
        System.out.println(CompanyOwner.getOwner("Infosys"));
        System.out.println(CompanyOwner.getOwner("Wipro"));
        System.out.println(CompanyOwner.getOwner("Adani Group"));
	}
}