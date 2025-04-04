package Assesments10;

public class RestaurantDetails extends Restaurant{
    @Override
    public void clockIn(){
        System.out.println("Staff cloking in");
    }
    @Override
    public void clockOut(){
        System.out.println("Staff clocking out");
    }
    @Override
    public void duties(){
        System.out.println("Perform duties");
    }
    @Override
    public void salary(){
        System.out.println("Recieve Salary");
    }
    @Override
    public void repeat(){
        System.out.println("Staff repeat everyday");
    }
}
