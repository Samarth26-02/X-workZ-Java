package Assesments16.Interfaces;

public interface Soap {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running soap properties..");
    }
}
