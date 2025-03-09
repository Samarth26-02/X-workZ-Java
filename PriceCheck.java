class PriceCheck{
	public static int getPrice(String source){
		if(source=="Laptop"){
			return 500000;
		}
		else if(source=="Smartphone"){
			return 15000;
		}
		else if(source=="Tablet"){
			return 20000;
		}
		else if(source=="Smartwatch"){
			return 1500;
		}
		else if(source=="Headphone"){
			return 3000;
		}
		else if(source=="Keyboard"){
			return 2000;
		}
		else if(source=="Mouse"){
			return 300;
		}
		else if(source=="Monitor"){
			return 7900;
		}
		else if(source=="Printer"){
			return 6500;
		}
		else if(source=="Camera"){
			return 30000;
		}
		else if(source=="TV"){
			return 45000;
		}
		else if(source=="Refrigerator"){
			return 50999;
		}
		else if(source=="Washing machine"){
			return 29999;
		}
		else if(source=="Oven"){
			return 25000;
		}
		else if(source=="AC"){
			return 20000;
		}
		else if(source=="Filter"){
			return 7999;
		}
		else if(source=="Speaker"){
			return 5000;
		}
		else if(source=="Gaming console"){
			return 30000;
		}
		else if(source=="Hard drive"){
			return 6000;
		}
		else if(source=="Fitness band"){
			return 2500;
		}
		return -1;
	}
}