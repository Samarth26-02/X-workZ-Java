package Assesments16.Interfaces;

public interface Car {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running car properties..");
    }

}
