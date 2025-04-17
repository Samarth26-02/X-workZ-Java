package Assesments16.Interfaces;

public interface Shampoo {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running shampoo properties..");
    }
}
