// InstallerDetails.java
package Assesments10;

public class InstallerDetails extends Installer {
    @Override
    public void prepare() {
        System.out.println("Preparing detailed installation");
    }

    @Override
    public void copyFiles() {
        System.out.println("Copying files with details");
    }

    @Override
    public void configure() {
        System.out.println("Configuring software with details");
    }

    @Override
    public void verify() {
        System.out.println("Verifying detailed installation");
    }

    @Override
    public void complete() {
        System.out.println("Completing detailed installation");
    }
}