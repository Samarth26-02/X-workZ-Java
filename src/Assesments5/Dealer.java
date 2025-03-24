package Assesment5;

public class Dealer {
    Car car=new Car();
  public void carDetails(){
        System.out.println(car.brand);
        System.out.println(car.price);
        System.out.println(car.mileage);

        car.showBrand();
        car.showPrice();
        car.showMileage();

    }
}
