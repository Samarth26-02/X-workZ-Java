package Assesments16.Interfaces;

public interface Lamp {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running lamp properties..");
    }
}
