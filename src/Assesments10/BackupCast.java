package Assesments10;

public class BackupCast {
    public void castBackup(Backup backup) {
        backup.initiate();
        backup.selectData();
        backup.copyData();
        backup.verifyBackup();
        backup.finalizeBackup();

        if (backup instanceof BackupDetails) {
            System.out.println("backup casting");
            BackupDetails backupDetails = (BackupDetails) backup;
            backupDetails.encryptionStatus();
        }
    }
}
