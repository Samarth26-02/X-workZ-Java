package Assesments16.Interfaces;

public interface Shirt {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running shirt properties..");
    }
}
