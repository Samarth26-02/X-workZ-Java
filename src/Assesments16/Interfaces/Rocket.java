package Assesments16.Interfaces;

public interface Rocket {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running rocket properties..");
    }
}
