package Assesments16.Interfaces;

public interface Microscope {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running microscope properties..");
    }
}
