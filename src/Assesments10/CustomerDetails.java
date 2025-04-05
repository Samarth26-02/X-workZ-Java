// CustomerDetails.java
package Assesments10;

public class CustomerDetails extends Customer {
    @Override
    public void inquire() {
        System.out.println("Customer making detailed inquiry");
    }

    @Override
    public void purchase() {
        System.out.println("Customer making detailed purchase");
    }

    @Override
    public void returnItem() {
        System.out.println("Customer returning item with details");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Customer providing detailed feedback");
    }

    @Override
    public void requestSupport() {
        System.out.println("Customer requesting detailed support");
    }
}