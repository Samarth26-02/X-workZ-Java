package Assesments;
class PostHeadMaster{
	public static void deliver(String customerName,String address){
		System.out.println(customerName);
		System.out.println(address);
		PostMaster.deliver(customerName,address);
	}
}