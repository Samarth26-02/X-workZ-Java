package Assesment6;

import Assesment5.LocalCustomer;

public class ProductRunner {
    public static void main(String[] args) {
        LocalCustomer localCustomer = new LocalCustomer();
        OnlineCustomer onlineCustomer = new OnlineCustomer();

        localCustomer.accessProductDetails();
        onlineCustomer.accessProductDetails();
    }
}
