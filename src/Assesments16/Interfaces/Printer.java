package Assesments16.Interfaces;

public interface Printer {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running printer properties..");
    }
}
