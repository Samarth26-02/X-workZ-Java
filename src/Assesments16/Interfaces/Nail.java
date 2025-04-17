package Assesments16.Interfaces;

public interface Nail {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running nail properties..");
    }
}
