package Assesments16.Interfaces;

public interface Wall {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running wall properties..");
    }
}
