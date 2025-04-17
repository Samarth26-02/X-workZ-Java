package Assesments16.Interfaces;

public interface Screwdriver {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running screwdriver properties..");
    }
}
