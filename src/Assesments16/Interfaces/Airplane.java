package Assesments16.Interfaces;

public interface Airplane {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running airplane properties..");
    }
}
