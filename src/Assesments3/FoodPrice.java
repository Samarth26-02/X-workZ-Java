package Assesments3;
class FoodPrice{
	public static int getPrice(String foodItem){
		if(foodItem=="Pizza"){
			return 250;
		}
		else if(foodItem=="Burger"){
			return 200;
		}
		else if(foodItem=="Pasta"){
			return 150;
		}
		else if(foodItem=="Sandwich"){
			return 100;
		}
		else if(foodItem=="Fries"){
			return 80;
		}
		else if(foodItem=="Tacos"){
			return 150;
		}
		else if(foodItem=="Noodles"){
			return 70;
		}
		else if(foodItem=="Fried rice"){
			return 80;
		}
		else if(foodItem=="Dosa"){
			return 90;
		}
		else if(foodItem=="Idli"){
			return 50;
		}
		else if(foodItem=="Samosa"){
			return 35;
		}
		else if(foodItem=="Pav Baji"){
			return 100;
		}
		else if(foodItem=="Biryani"){
			return 150;
		}
		else if(foodItem=="Paneer tikka"){
			return 200;
		}
		else if(foodItem=="Chole bhature"){
			return 120;
		}
		else if(foodItem=="Spring roll"){
			return 130;
		}
		else if(foodItem=="Momos"){
			return 110;
		}
		else if(foodItem=="Dal makhani"){
			return 160;
		}
		else if(foodItem=="Rajma chawal"){
			return 140;
		}
		return -1;
	}
}