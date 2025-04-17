package Assesments16.Interfaces;

public interface Vehicle {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running vehicle properties..");
    }
}
