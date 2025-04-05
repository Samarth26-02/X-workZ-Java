// FileEncryptorRunner.java
package Assesments10;

public class FileEncryptorRunner {
    public static void main(String[] args) {
        FileEncryptor encryptor = new FileEncryptor();
        encryptor.selectFile();
        encryptor.setPassword();
        encryptor.encrypt();
        encryptor.decrypt();
        encryptor.verifyDecryption();

        System.out.println("----------------------");

        FileEncryptor encryptor1 = new FileEncryptorDetails();
        encryptor1.verifyDecryption();
        encryptor1.decrypt();
        encryptor1.encrypt();
        encryptor1.setPassword();
        encryptor1.selectFile();

        System.out.println("----------------------");

        FileEncryptorDetails encryptorDetails = new FileEncryptorDetails();
        encryptorDetails.selectFile();
        encryptorDetails.verifyDecryption();
        encryptorDetails.decrypt();
        encryptorDetails.encrypt();
        encryptorDetails.setPassword();
    }
}