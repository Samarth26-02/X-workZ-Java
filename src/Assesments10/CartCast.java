package Assesments10;

public class CartCast {
    public void castCart(Cart cart) {
        cart.addItem();
        cart.removeItem();
        cart.viewItems();
        cart.checkout();
        cart.clear();

        if (cart instanceof CartDetails) {
            System.out.println("cart casting");
            CartDetails details = (CartDetails) cart;
            details.applyDiscount();
        }
    }
}
