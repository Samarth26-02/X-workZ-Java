package Assesments16.Interfaces;

public interface WasshingMachine {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running washingmachine properties..");
    }
}
