package Assesments16.Interfaces;

public interface Shoe {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running shoe properties..");
    }
}
