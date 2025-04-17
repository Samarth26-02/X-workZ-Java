package Assesments16.Interfaces;

public interface Floor {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running floor properties..");
    }
}
