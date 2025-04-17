package Assesments16.Interfaces;

public interface Camera {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running camera properties..");
    }
}
