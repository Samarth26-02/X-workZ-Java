class ChatsRunner{
	public static void main(String[] args){
		String name="Pani Puri";
		String type="Spicy";
		int price=30;
		Chats chats1=new Chats(name,type,price);
		System.out.println("Chat name:"+chats1.name);
		System.out.println("Chat type:"+chats1.type);
		System.out.println("Chat price:"+chats1.price);
		
		name="Samosa Chat";
		type="Spicy";
		price=80;
		Chats chats2=new Chats(name,type,price);
		System.out.println("Chat name:"+chats2.name);
		System.out.println("Chat type:"+chats2.type);
		System.out.println("Chat price:"+chats2.price);
		
		name="Dahi vada";
		type="Sweet";
		price=60;
		Chats chats3=new Chats(name,type,price);
		System.out.println("Chat name:"+chats3.name);
		System.out.println("Chat type:"+chats3.type);
		System.out.println("Chat price:"+chats3.price);
		
		name="Aloo Chat";
		type="Spicy";
		price=50;
		Chats chats4=new Chats(name,type,price);
		System.out.println("Chat name:"+chats4.name);
		System.out.println("Chat type:"+chats4.type);
		System.out.println("Chat price:"+chats4.price);
		
		name="Pakora";
		type="Spicy";
		price=60;
		Chats chats5=new Chats(name,type,price);
		System.out.println("Chat name:"+chats5.name);
		System.out.println("Chat type:"+chats5.type);
		System.out.println("Chat price:"+chats5.price);
	}
}