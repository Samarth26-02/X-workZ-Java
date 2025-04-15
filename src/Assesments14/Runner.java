package Assesments14;

public class Runner {
    public static void main(String[] args) {
        //1.
        Circle circle=new Circle();
        circle.display();

        //2.
        Cat cat=new Cat();
        cat.sound();

        //3.
        Car car=new Car();
        car.move();
        car.start();

        //4.
        Manager manager=new Manager("Max",100,50000);
        manager.dispaly();

        //5.
        Electronics electronics=new Electronics(10,"Mobile",25000.0,1);
        electronics.display();


    }
}
