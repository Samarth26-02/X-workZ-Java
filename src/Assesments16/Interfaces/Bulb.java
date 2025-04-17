package Assesments16.Interfaces;

public interface Bulb {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running bulb properties..");
    }
}
