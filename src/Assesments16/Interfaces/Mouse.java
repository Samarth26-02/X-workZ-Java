package Assesments16.Interfaces;

public interface Mouse {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running mouse properties..");
    }
}
