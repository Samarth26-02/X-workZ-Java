package Assesments16.Interfaces;

public interface Socks {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running socks properties..");
    }
}
