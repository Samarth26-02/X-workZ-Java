package Assesments16.Interfaces;

public interface Speaker {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running speaker properties..");
    }

}
