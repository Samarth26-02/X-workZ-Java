package Assesments16.Interfaces;

public interface Satelite {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running satelite properties..");
    }
}
