package Assesments16.Interfaces;

public interface Keyboard {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running keyboard properties..");
    }
}
