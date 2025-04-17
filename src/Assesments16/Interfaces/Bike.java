package Assesments16.Interfaces;

public interface Bike {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running bike properties..");
    }

}
