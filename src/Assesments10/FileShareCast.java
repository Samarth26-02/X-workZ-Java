package Assesments10;

public class FileShareCast {
    public void castFileShare(FileShare fileShare) {
        fileShare.uploadFile();
        fileShare.downloadFile();
        fileShare.shareFile();
        fileShare.unshareFile();
        fileShare.checkPermissions();

        if (fileShare instanceof FileShareDetails) {
            System.out.println("Casting to FileShareDetails...");
            FileShareDetails details = (FileShareDetails) fileShare;
            details.setExpiration();
        }
    }
}