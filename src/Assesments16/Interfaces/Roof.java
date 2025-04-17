package Assesments16.Interfaces;

public interface Roof {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running roof properties..");
    }
}
