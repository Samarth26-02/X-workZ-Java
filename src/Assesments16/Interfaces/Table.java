package Assesments16.Interfaces;

public interface Table {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running table properties..");
    }
}
