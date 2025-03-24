package Assesment5;

public class Car {
    public String brand="FORD Mustang 1969";
    long price=9000000;
    private String engineType="V8";
    public int mileage=13;

    public void showBrand(){
        System.out.println("Car Brand:"+brand);
    }
    void showPrice(){
        System.out.println("car price:"+price);
    }
    private void showEngineType(){
        System.out.println("Car engine type:"+engineType);
    }
    public void showMileage(){
        System.out.println("Car mileage:"+mileage);
    }
}
