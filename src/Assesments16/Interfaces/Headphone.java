package Assesments16.Interfaces;

public interface Headphone {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running headphone properties..");
    }
}
