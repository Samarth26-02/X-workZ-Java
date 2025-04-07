package Assesments10;

public class FileEncryptorCast {
    public void castEncryptor(FileEncryptor encryptor) {
        encryptor.selectFile();
        encryptor.setPassword();
        encryptor.encrypt();
        encryptor.decrypt();
        encryptor.verifyDecryption();

        if (encryptor instanceof FileEncryptorDetails) {
            System.out.println("Casting to FileEncryptorDetails...");
            FileEncryptorDetails details = (FileEncryptorDetails) encryptor;
            details.generateLog();
        }
    }
}