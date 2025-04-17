package Assesments16.Interfaces;

public interface Book {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running book properties..");
    }
}
