package Assesments16.Interfaces;

public interface Bed {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running bed properties..");
    }
}
