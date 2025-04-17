package Assesments16.Interfaces;

public interface Clock {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running clock properties..");
    }

}
