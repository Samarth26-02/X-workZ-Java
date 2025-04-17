package Assesments16.Interfaces;

public interface Chair {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running chair properties..");
    }
}
