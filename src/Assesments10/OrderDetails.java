package Assesments10;

public class OrderDetails extends Order{
    @Override
    public void create() {
        System.out.println("Creating detailed order");
    }

    @Override
    public void process() {
        System.out.println("Processing detailed order");
    }

    @Override
    public void ship() {
        System.out.println("Shipping detailed order");
    }

    @Override
    public void track() {
        System.out.println("Tracking detailed order");
    }

    @Override
    public void cancel() {
        System.out.println("Canceling detailed order");
    }
}
