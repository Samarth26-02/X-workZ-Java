package Assesments16.Interfaces;

public interface Sofa {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running sofa properties..");
    }
}
