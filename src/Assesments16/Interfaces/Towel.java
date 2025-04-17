package Assesments16.Interfaces;

public interface Towel {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running towel properties..");
    }
}
