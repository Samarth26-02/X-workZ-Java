package Assesments16.Interfaces;

public interface Laptop {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running laptop properties..");
    }
}
