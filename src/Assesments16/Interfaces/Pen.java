package Assesments16.Interfaces;

public interface Pen {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running pen properties..");
    }
}
