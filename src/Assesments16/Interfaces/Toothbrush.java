package Assesments16.Interfaces;

public interface Toothbrush {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running toothbrush properties..");
    }
}
