package Assesments16.Interfaces;

public interface Curtain {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running curtain properties..");
    }
}
