package Assesments16.Interfaces;

public interface Ship {
    void identity();
    void state();
    void behaviour();
    default void properties(){
        System.out.println("running ship properties..");
    }

}
