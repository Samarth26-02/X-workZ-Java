// InstallerRunner.java
package Assesments10;

public class InstallerRunner {
    public static void main(String[] args) {
        Installer installer = new Installer();
        installer.prepare();
        installer.copyFiles();
        installer.configure();
        installer.verify();
        installer.complete();

        System.out.println("----------------------");

        Installer installer1 = new InstallerDetails();
        installer1.complete();
        installer1.verify();
        installer1.configure();
        installer1.copyFiles();
        installer1.prepare();

        System.out.println("----------------------");

        InstallerDetails installerDetails = new InstallerDetails();
        installerDetails.prepare();
        installerDetails.complete();
        installerDetails.verify();
        installerDetails.configure();
        installerDetails.copyFiles();
        installerDetails.createBackup();

        System.out.println("----------------------");

        InstallerCast installerCast = new InstallerCast();
        installerCast.castInstaller(installer);
        System.out.println("----------------------");
        installerCast.castInstaller(installerDetails);
    }
}