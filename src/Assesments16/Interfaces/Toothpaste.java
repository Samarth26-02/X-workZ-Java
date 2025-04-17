package Assesments16.Interfaces;

public interface Toothpaste {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running toothpaste properties..");
    }
}
