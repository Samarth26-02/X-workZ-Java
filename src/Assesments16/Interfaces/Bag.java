package Assesments16.Interfaces;

public interface Bag {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running bag properties..");
    }
}
