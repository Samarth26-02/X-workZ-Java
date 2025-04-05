package Assesments10;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order();
        order.create();
        order.process();
        order.ship();
        order.track();
        order.cancel();

        System.out.println("----------------------");

        Order order1 = new OrderDetails();
        order1.cancel();
        order1.track();
        order1.ship();
        order1.process();
        order1.create();

        System.out.println("----------------------");

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.create();
        orderDetails.cancel();
        orderDetails.track();
        orderDetails.ship();
        orderDetails.process();
    }
}
