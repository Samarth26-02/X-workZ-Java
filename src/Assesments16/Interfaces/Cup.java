package Assesments16.Interfaces;

public interface Cup {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running cup properties..");
    }
}
