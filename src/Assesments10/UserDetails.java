package Assesments10;

public class UserDetails extends User{
    @Override
    public void login(){
        System.out.println("User Login");
    }
    @Override
    public void logout(){
        System.out.println("User Logout");
    }
    @Override
    public void browseProducts(){
        System.out.println("User browse the Products");
    }
    @Override
    public void viewProfile(){
        System.out.println("User Profile");
    }
    @Override
    public void buyProduct(){
        System.out.println("User buys the product");
    }
}
