package Assesments16.Interfaces;

public interface Bus {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running bus properties..");
    }

}
