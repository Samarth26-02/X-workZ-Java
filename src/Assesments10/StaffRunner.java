package Assesments10;

public class StaffRunner {
    public static void main(String[] args) {
        Staff staff=new Staff();
        staff.checkIn();
        staff.duties();
        staff.getPaid();
        staff.checkOut();
        staff.repeat();
        System.out.println("-------------");
        Staff staff1=new StaffDetails();
        staff1.checkIn();
        staff1.duties();
        staff1.getPaid();
        staff1.checkOut();
        staff1.repeat();
        System.out.println("-------------");
        StaffDetails staffDetails=new StaffDetails();
        staffDetails.checkIn();
        staffDetails.checkOut();
        staffDetails.duties();
        staffDetails.getPaid();
        staffDetails.repeat();
    }
}
