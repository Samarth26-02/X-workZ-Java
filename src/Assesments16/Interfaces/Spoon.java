package Assesments16.Interfaces;

public interface Spoon {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running spoon properties..");
    }
}
