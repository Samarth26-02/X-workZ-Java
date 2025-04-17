package Assesments16.Interfaces;

public interface Smartphone {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running smartphone properties..");
    }
}
