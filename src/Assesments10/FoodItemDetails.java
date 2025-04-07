package Assesments10;

public class FoodItemDetails extends FoodItem{
    @Override
    public void prepare(){
        System.out.println("Prepare food");
    }
    @Override
    public void serve(){
        System.out.println("Serve the food");
    }
    @Override
    public void addToBill(){
        System.out.println("Add to bill");
    }
    @Override
    public void getCalories(){
        System.out.println("Calories");
    }
    @Override
    public void applyDiscount(){
        System.out.println("Discount applied");
    }
    public void displayIngredients(){
        System.out.println("Displaying ingredients");
    }
}