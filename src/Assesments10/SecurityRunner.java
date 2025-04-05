package Assesments10;

public class SecurityRunner {
    public static void main(String[] args) {
        Security security = new Security();
        security.authenticate();
        security.authorize();
        security.encrypt();
        security.decrypt();
        security.logActivity();

        System.out.println("----------------------");

        Security security1 = new SecurityDetails();
        security1.logActivity();
        security1.decrypt();
        security1.encrypt();
        security1.authorize();
        security1.authenticate();

        System.out.println("----------------------");

        SecurityDetails securityDetails = new SecurityDetails();
        securityDetails.authenticate();
        securityDetails.logActivity();
        securityDetails.decrypt();
        securityDetails.encrypt();
        securityDetails.authorize();
    }
}
