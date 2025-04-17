package Assesments16.Interfaces;

public interface Television {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running television properties..");
    }
}
