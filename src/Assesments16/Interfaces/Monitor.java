package Assesments16.Interfaces;

public interface Monitor {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running monitor properties..");
    }
}
