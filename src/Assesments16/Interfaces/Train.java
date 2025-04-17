package Assesments16.Interfaces;

public interface Train {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running train properties..");
    }

}
