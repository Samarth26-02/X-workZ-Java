package Assesments16.Interfaces;

public interface Cap {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running cap properties..");
    }
}
