// CustomerRunner.java
package Assesments10;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.inquire();
        customer.purchase();
        customer.returnItem();
        customer.provideFeedback();
        customer.requestSupport();

        System.out.println("----------------------");

        Customer customer1 = new CustomerDetails();
        customer1.requestSupport();
        customer1.provideFeedback();
        customer1.returnItem();
        customer1.purchase();
        customer1.inquire();

        System.out.println("----------------------");

        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.inquire();
        customerDetails.requestSupport();
        customerDetails.provideFeedback();
        customerDetails.returnItem();
        customerDetails.purchase();
    }
}