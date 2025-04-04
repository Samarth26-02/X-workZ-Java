package Assesments10;

public class UserRunner {
    public static void main(String[] args) {
        User user=new User();
        user.login();
        user.viewProfile();
        user.browseProducts();
        user.buyProduct();
        user.logout();
        System.out.println("---------------");
        User user1=new UserDetails();
        user1.login();
        user1.viewProfile();
        user1.browseProducts();
        user1.buyProduct();
        user1.logout();
        System.out.println("-------------");
        UserDetails userDetails=new UserDetails();
        userDetails.browseProducts();
        userDetails.login();
        userDetails.logout();
        userDetails.buyProduct();
        userDetails.viewProfile();
    }
}
