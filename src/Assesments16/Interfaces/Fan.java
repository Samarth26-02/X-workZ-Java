package Assesments16.Interfaces;

public interface Fan {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running fan properties..");
    }
}
