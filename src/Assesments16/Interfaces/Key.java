package Assesments16.Interfaces;

public interface Key {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running key properties..");
    }
}
