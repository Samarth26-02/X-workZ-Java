package Assesments16.Interfaces;

public interface Remote {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running remote properties..");
    }
}
