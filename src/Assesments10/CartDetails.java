package Assesments10;

public class CartDetails extends Cart {
    @Override
    public void addItem() {
        System.out.println("Adding detailed item to cart");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing detailed item from cart");
    }

    @Override
    public void viewItems() {
        System.out.println("Viewing detailed items in cart");
    }

    @Override
    public void checkout() {
        System.out.println("Checking out detailed cart");
    }

    @Override
    public void clear() {
        System.out.println("Clearing detailed cart");
    }

    public void applyDiscount() {
        System.out.println("Applying discount to cart");
    }
}
