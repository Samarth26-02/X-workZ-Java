package Assesments10;

public class InstallerCast {
    public void castInstaller(Installer installer) {
        installer.prepare();
        installer.copyFiles();
        installer.configure();
        installer.verify();
        installer.complete();

        if (installer instanceof InstallerDetails) {
            System.out.println("Casting to InstallerDetails...");
            InstallerDetails details = (InstallerDetails) installer;
            details.createBackup();
        }
    }
}