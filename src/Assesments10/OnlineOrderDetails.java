// OnlineOrderDetails.java
package Assesments10;

public class OnlineOrderDetails extends OnlineOrder {
    @Override
    public void placeOrder() {
        System.out.println("Placing detailed online order");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking detailed online order");
    }

    @Override
    public void updateOrder() {
        System.out.println("Updating detailed online order");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Canceling detailed online order");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment for detailed online order");
    }
}