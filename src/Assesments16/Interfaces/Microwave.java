package Assesments16.Interfaces;

public interface Microwave {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running microwave properties..");
    }
}
