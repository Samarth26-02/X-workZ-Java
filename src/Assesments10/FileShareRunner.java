// FileShareRunner.java
package Assesments10;

public class FileShareRunner {
    public static void main(String[] args) {
        FileShare fileShare = new FileShare();
        fileShare.uploadFile();
        fileShare.downloadFile();
        fileShare.shareFile();
        fileShare.unshareFile();
        fileShare.checkPermissions();

        System.out.println("----------------------");

        FileShare fileShare1 = new FileShareDetails();
        fileShare1.checkPermissions();
        fileShare1.unshareFile();
        fileShare1.shareFile();
        fileShare1.downloadFile();
        fileShare1.uploadFile();

        System.out.println("----------------------");

        FileShareDetails fileShareDetails = new FileShareDetails();
        fileShareDetails.uploadFile();
        fileShareDetails.checkPermissions();
        fileShareDetails.unshareFile();
        fileShareDetails.shareFile();
        fileShareDetails.downloadFile();
        fileShareDetails.setExpiration();

        System.out.println("----------------------");

        FileShareCast fileShareCast = new FileShareCast();
        fileShareCast.castFileShare(fileShare);
        System.out.println("----------------------");
        fileShareCast.castFileShare(fileShareDetails);
    }
}