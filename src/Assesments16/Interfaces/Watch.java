package Assesments16.Interfaces;

public interface Watch {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running watch properties..");
    }

}
