package Assesments16.Interfaces;

public interface Mirror {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running mirror properties..");
    }
}
