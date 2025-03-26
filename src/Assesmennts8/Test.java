package Assesmennts8;

public class Test {
    public static int number;

    static{
        number=10;
        System.out.println("Static block execution."+number);
    }
    public Test(){
        number++;
        System.out.println("Increment number by 1");
    }
}
