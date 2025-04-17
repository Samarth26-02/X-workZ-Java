package Assesments16.Interfaces;

public interface Drone {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running drone properties..");
    }
}
