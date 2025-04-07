package Assesments10;

public class CartRunner {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem();
        cart.removeItem();
        cart.viewItems();
        cart.checkout();
        cart.clear();

        System.out.println("----------------------");

        Cart cart1 = new CartDetails();
        cart1.clear();
        cart1.checkout();
        cart1.viewItems();
        cart1.removeItem();
        cart1.addItem();

        System.out.println("----------------------");

        CartDetails cartDetails = new CartDetails();
        cartDetails.addItem();
        cartDetails.clear();
        cartDetails.checkout();
        cartDetails.viewItems();
        cartDetails.removeItem();
        cartDetails.applyDiscount();

        System.out.println("----------------------");

        CartCast cartCast = new CartCast();
        cartCast.castCart(cart);
        cartCast.castCart(cart1);
    }
}
