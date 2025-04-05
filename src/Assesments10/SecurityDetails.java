package Assesments10;

public class SecurityDetails extends Security{
    @Override
    public void authenticate() {
        System.out.println("Authenticating user with detailed security");
    }

    @Override
    public void authorize() {
        System.out.println("Authorizing user access with detailed security");
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting data with detailed security");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypting data with detailed security");
    }

    @Override
    public void logActivity() {
        System.out.println("Logging detailed security activity");
    }
}
