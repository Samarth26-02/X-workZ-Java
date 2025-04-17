package Assesments16.Interfaces;

public interface Battery {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running battery properties..");
    }
}
