package Assesments16.Interfaces;

public interface Carpet {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running carpet properties..");
    }
}
