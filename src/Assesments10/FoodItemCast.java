package Assesments10;

public class FoodItemCast {
    public void castFoodItem(FoodItem foodItem) {
        foodItem.prepare();
        foodItem.serve();
        foodItem.addToBill();
        foodItem.getCalories();
        foodItem.applyDiscount();

        if (foodItem instanceof FoodItemDetails) {
            System.out.println("Casting to FoodItemDetails...");
            FoodItemDetails details = (FoodItemDetails) foodItem;
            details.displayIngredients();
        }
    }
}