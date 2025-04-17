package Assesments16.Interfaces;

public interface Window {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running window properties..");
    }
}
