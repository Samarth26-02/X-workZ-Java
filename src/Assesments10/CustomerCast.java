package Assesments10;

public class CustomerCast {
    public void castCustomer(Customer customer) {
        customer.inquire();
        customer.purchase();
        customer.returnItem();
        customer.provideFeedback();
        customer.requestSupport();

        if (customer instanceof CustomerDetails) {
            System.out.println("Casting to CustomerDetails...");
            CustomerDetails details = (CustomerDetails) customer;
            details.applyDiscount();
        }
    }
}
