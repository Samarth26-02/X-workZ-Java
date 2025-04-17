package Assesments16.Interfaces;

public interface Oven {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running oven properties..");
    }
}
