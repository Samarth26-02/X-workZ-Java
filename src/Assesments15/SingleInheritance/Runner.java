package Assesments15.SingleInheritance;

public class Runner {
    public static void main(String[] args) {
       //1.
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
        //2.
        Bike bike=new Bike();
        bike.indicator();
        bike.start();
        //3.
        Student student=new Student();
        student.study();
        student.speak();
        //4.
        Circle circle=new Circle();
        circle.calculateArea();
        circle.display();
        //5.
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.washClothes();
        washingMachine.powerOn();
        //6.
        Developer developer=new Developer();
        developer.writeCode();
        developer.work();
        //7.
        Smartphone smartphone=new Smartphone();
        smartphone.makeCall();
        smartphone.switchOn();
        //8.
        DieselEngine dieselEngine=new DieselEngine();
        dieselEngine.injectFuel();
        dieselEngine.start();
        //9.
        Guitar guitar=new Guitar();
        guitar.strum();
        guitar.play();
        //10.
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.openAccount();
        savingsAccount.depositMoney();
        //11.
        Novel novel=new Novel();
        novel.displayGenre();
        novel.read();
    }
}
