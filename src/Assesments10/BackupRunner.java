package Assesments10;

public class BackupRunner {
    public static void main(String[] args) {
        Backup backup = new Backup();
        backup.initiate();
        backup.selectData();
        backup.copyData();
        backup.verifyBackup();
        backup.finalizeBackup();

        System.out.println("----------------------");

        Backup backup1 = new BackupDetails();
        backup1.finalizeBackup();
        backup1.verifyBackup();
        backup1.copyData();
        backup1.selectData();
        backup1.initiate();

        System.out.println("----------------------");

        BackupDetails backupDetails = new BackupDetails();
        backupDetails.initiate();
        backupDetails.finalizeBackup();
        backupDetails.verifyBackup();
        backupDetails.copyData();
        backupDetails.selectData();
        backupDetails.encryptionStatus();

        System.out.println("----------------------");

        BackupCast backupCast = new BackupCast();
        backupCast.castBackup(backup);
        backupCast.castBackup(backup1);
    }
}
