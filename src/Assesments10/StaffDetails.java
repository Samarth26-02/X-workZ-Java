package Assesments10;

public class StaffDetails extends Staff{
    @Override
    public void checkIn(){
        System.out.println("Staff checkin");
    }
    @Override
    public void checkOut(){
        System.out.println("Staff checkout");
    }
    @Override
    public void duties(){
        System.out.println("Staff perform duties");
    }
    @Override
    public void getPaid(){
        System.out.println("Staff get paid");
    }
    @Override
    public void repeat(){
        System.out.println("Staff repeats everyday");
    }
}
