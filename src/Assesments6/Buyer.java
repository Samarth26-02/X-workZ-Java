package Assesment6;

import Assesment5.Car;

public class Buyer {
    Car car=new Car();
    public void accessCarDetail(){
        System.out.println(car.brand);
        System.out.println(car.mileage);
        car.showBrand();
        car.showMileage();
    }
}
