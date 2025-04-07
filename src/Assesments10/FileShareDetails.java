// FileShareDetails.java
package Assesments10;

public class FileShareDetails extends FileShare {
    @Override
    public void uploadFile() {
        System.out.println("Uploading detailed file");
    }

    @Override
    public void downloadFile() {
        System.out.println("Downloading detailed file");
    }

    @Override
    public void shareFile() {
        System.out.println("Sharing detailed file");
    }

    @Override
    public void unshareFile() {
        System.out.println("Unsharing detailed file");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checking detailed file permissions");
    }

    public void setExpiration() {
        System.out.println("Setting share expiration date");
    }
}