class MagnetRunner{
	public static void main(String[] args){
		String name="Neodymium";
		int price=50;
		char size='S';
		Magnet magnet1=new Magnet(name,price,size);
		System.out.println("Magnet name:"+magnet1.name);
		System.out.println("Magnet price:"+magnet1.price);
		System.out.println("Magnet size:"+magnet1.size);
		
		name="Ferrite";
		price=30;
		size='S';
		Magnet magnet2=new Magnet(name,price,size);
		System.out.println("Magnet name:"+magnet2.name);
		System.out.println("Magnet price:"+magnet2.price);
		System.out.println("Magnet size:"+magnet2.size);
		
		name="Alnico";
		price=200;
		size='M';
		Magnet magnet3=new Magnet(name,price,size);
		System.out.println("Magnet name:"+magnet3.name);
		System.out.println("Magnet price:"+magnet3.price);
		System.out.println("Magnet size:"+magnet3.size);
		
		name="Samarium";
		price=150;
		size='L';
		Magnet magnet4=new Magnet(name,price,size);
		System.out.println("Magnet name:"+magnet4.name);
		System.out.println("Magnet price:"+magnet4.price);
		System.out.println("Magnet size:"+magnet4.size);
		
		name="Ceramic";
		price=40;
		size='S';
		Magnet magnet5=new Magnet(name,price,size);
		System.out.println("Magnet name:"+magnet5.name);
		System.out.println("Magnet price:"+magnet5.price);
		System.out.println("Magnet size:"+magnet5.size);
	}
}