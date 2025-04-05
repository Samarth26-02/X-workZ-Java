package Assesments10;

public class ProductDetails extends Product{
    @Override
    public void add() {
        System.out.println("Adding detailed product information");
    }

    @Override
    public void display() {
        System.out.println("Displaying detailed product view");
    }

    @Override
    public void update() {
        System.out.println("Updating detailed product data");
    }

    @Override
    public void remove() {
        System.out.println("Removing detailed product entry");
    }

    @Override
    public void checkInventory() {
        System.out.println("Checking detailed product inventory levels");
    }
}
