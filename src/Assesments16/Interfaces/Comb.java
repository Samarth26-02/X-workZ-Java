package Assesments16.Interfaces;

public interface Comb {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running comb properties..");
    }
}
