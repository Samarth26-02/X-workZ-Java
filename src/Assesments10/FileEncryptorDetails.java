// FileEncryptorDetails.java
package Assesments10;

public class FileEncryptorDetails extends FileEncryptor {
    @Override
    public void selectFile() {
        System.out.println("Selecting file for encryption with details");
    }

    @Override
    public void setPassword() {
        System.out.println("Setting strong encryption password");
    }

    @Override
    public void encrypt() {
        System.out.println("Encrypting file with advanced algorithm");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypting file with provided key");
    }

    @Override
    public void verifyDecryption() {
        System.out.println("Verifying successful decryption");
    }

    public void generateLog() {
        System.out.println("Generating encryption/decryption log");
    }
}