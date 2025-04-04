package Assesments10;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.brand();
        laptop.model();
        laptop.processor();
        laptop.ram();
        laptop.storage();
        System.out.println("-------------");
        Laptop laptop1=new LaptopDetails();
        laptop1.brand();
        laptop1.model();
        laptop1.processor();
        laptop1.ram();
        laptop1.storage();
        System.out.println("-------------");
        LaptopDetails laptopDetails=new LaptopDetails();
        laptopDetails.brand();
        laptopDetails.model();
        laptopDetails.ram();
        laptopDetails.storage();
        laptopDetails.processor();
    }
}
