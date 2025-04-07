package Assesments10;

public class BackupDetails extends Backup {
    @Override
    public void initiate() {
        System.out.println("Initiating detailed backup");
    }

    @Override
    public void selectData() {
        System.out.println("Selecting data for detailed backup");
    }

    @Override
    public void copyData() {
        System.out.println("Copying data with details");
    }

    @Override
    public void verifyBackup() {
        System.out.println("Verifying detailed backup");
    }

    @Override
    public void finalizeBackup() {
        System.out.println("Finalizing detailed backup");
    }

    public void encryptionStatus() {
        System.out.println("Data is encrypted with AES-256");
    }
}
