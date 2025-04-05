// OnlineOrderRunner.java
package Assesments10;

public class OnlineOrderRunner {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.placeOrder();
        order.trackOrder();
        order.updateOrder();
        order.cancelOrder();
        order.processPayment();

        System.out.println("----------------------");

        OnlineOrder order1 = new OnlineOrderDetails();
        order1.processPayment();
        order1.cancelOrder();
        order1.updateOrder();
        order1.trackOrder();
        order1.placeOrder();

        System.out.println("----------------------");

        OnlineOrderDetails orderDetails = new OnlineOrderDetails();
        orderDetails.placeOrder();
        orderDetails.processPayment();
        orderDetails.cancelOrder();
        orderDetails.updateOrder();
        orderDetails.trackOrder();
    }
}