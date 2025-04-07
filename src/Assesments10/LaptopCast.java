package Assesments10;

public class LaptopCast {
    public void castLaptop(Laptop laptop) {
        laptop.brand();
        laptop.model();
        laptop.processor();
        laptop.ram();
        laptop.storage();

        if (laptop instanceof LaptopDetails) {
            System.out.println("Casting to LaptopDetails...");
            LaptopDetails details = (LaptopDetails) laptop;
            details.displayOS();
        }
    }
}