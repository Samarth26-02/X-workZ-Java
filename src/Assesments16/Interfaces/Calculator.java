package Assesments16.Interfaces;

public interface Calculator {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running calculator properties..");
    }
}
