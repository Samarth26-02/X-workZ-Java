package Assesment6;

import Assesment5.Product;

public class OnlineCustomer {
    Product product = new Product();

    void accessProductDetails() {
        System.out.println("Product name: " + product.productName);
        System.out.println("Seller: " + product.seller);

        product.showProductName();
        product.showSeller();
    }
}
