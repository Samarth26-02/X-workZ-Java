package Assesments16.Interfaces;

public interface Glass {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running glass properties..");
    }
}
