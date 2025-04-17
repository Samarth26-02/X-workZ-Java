package Assesments16.Interfaces;

public interface Plate {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running plate properties..");
    }
}
