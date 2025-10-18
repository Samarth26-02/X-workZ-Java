
package Assesment5;

public class Product {
    public String productName = "Smartphone";
    int price = 500;
    private int discount = 10;
    public String seller = "Tech Store";

    public void showProductName() {
        System.out.println("Product Name: " + productName);
    }

    void showPrice() {
        System.out.println("Product Price: $" + price);
    }

    private void showDiscount() {
        System.out.println("Product Discount: " + discount + "%");
    }

    public void showSeller() {
        System.out.println("Seller: " + seller);
    }
}
