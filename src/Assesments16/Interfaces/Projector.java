package Assesments16.Interfaces;

public interface Projector {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running projector properties..");
    }
}
