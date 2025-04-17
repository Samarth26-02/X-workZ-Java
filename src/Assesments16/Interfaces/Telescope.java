package Assesments16.Interfaces;

public interface Telescope {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running telescope properties..");
    }
}
