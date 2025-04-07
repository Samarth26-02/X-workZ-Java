package Assesments10;

public class FileCast {
    public void castFile(File file) {
        file.open();
        file.read();
        file.write();
        file.close();
        file.delete();

        if (file instanceof FileDetails) {
            System.out.println("Casting to FileDetails...");
            FileDetails details = (FileDetails) file;
            details.encrypt();
        }
    }
}