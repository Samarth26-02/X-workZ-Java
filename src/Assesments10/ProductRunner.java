package Assesments10;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.add();
        product.display();
        product.update();
        product.remove();
        product.checkInventory();

        System.out.println("----------------------");

        Product product1 = new ProductDetails();
        product1.checkInventory();
        product1.remove();
        product1.update();
        product1.display();
        product1.add();

        System.out.println("----------------------");

        ProductDetails productDetails = new ProductDetails();
        productDetails.add();
        productDetails.checkInventory();
        productDetails.remove();
        productDetails.update();
        productDetails.display();
    }
}
