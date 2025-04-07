package Assesments10;

public class FoodItemRunner {
    public static void main(String[] args) {
        FoodItem foodItem=new FoodItem();
        foodItem.prepare();
        foodItem.serve();
        foodItem.getCalories();
        foodItem.addToBill();
        foodItem.applyDiscount();
        System.out.println("--------------");
        FoodItem foodItem1=new FoodItemDetails();
        foodItem1.prepare();
        foodItem1.serve();
        foodItem1.getCalories();
        foodItem1.addToBill();
        foodItem1.applyDiscount();

        System.out.println("-------------");
        FoodItemDetails foodItemDetails=new FoodItemDetails();
        foodItemDetails.addToBill();
        foodItemDetails.serve();
        foodItemDetails.prepare();
        foodItemDetails.getCalories();
        foodItemDetails.applyDiscount();
        foodItemDetails.displayIngredients();

        System.out.println("-------------");
        FoodItemCast foodItemCast = new FoodItemCast();
        foodItemCast.castFoodItem(foodItem);
        System.out.println("-------------");
        foodItemCast.castFoodItem(foodItemDetails);
    }
}