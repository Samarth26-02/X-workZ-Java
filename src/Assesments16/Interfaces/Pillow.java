package Assesments16.Interfaces;

public interface Pillow {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running pillow properties..");
    }
}
