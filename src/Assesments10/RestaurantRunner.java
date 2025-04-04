package Assesments10;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        restaurant.clockIn();
        restaurant.duties();
        restaurant.salary();
        restaurant.clockOut();
        restaurant.repeat();
        System.out.println("-------------");
        Restaurant restaurant1=new RestaurantDetails();
        restaurant1.clockIn();
        restaurant1.duties();
        restaurant1.salary();
        restaurant1.clockOut();
        restaurant1.repeat();
        RestaurantDetails restaurantDetails=new RestaurantDetails();
        restaurantDetails.clockIn();
        restaurantDetails.clockOut();
        restaurantDetails.duties();
        restaurantDetails.salary();
        restaurantDetails.repeat();
    }
}
