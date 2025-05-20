package Assesment5;
//assesment5

public class Dealer {
    Assesment5.Car car=new Assesment5.Car();
  public void carDetails(){
        System.out.println(car.brand);
        System.out.println(car.price);
        System.out.println(car.mileage);

        car.showBrand();
        car.showPrice();
        car.showMileage();

    }
}
