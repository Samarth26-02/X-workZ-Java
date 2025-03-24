package Assesments6;

import Assesment5.Customer;

public class BankRunner {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Assesment6.ECustomer ecustomer=new Assesment6.ECustomer();
        customer.bankDetails();
        ecustomer.ebankDetails();
    }
}
