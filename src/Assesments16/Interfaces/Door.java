package Assesments16.Interfaces;

public interface Door {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running door properties..");
    }
}
