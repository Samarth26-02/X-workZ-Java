package Assesments16.Interfaces;

public interface Lock {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running lock properties..");
    }
}
