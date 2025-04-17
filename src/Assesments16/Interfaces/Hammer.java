package Assesments16.Interfaces;

public interface Hammer {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running hammer properties..");
    }
}
