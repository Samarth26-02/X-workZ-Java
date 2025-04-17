package Assesments16.Interfaces;

public interface Fridge {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running fridge properties..");
    }

}
