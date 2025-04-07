package Assesments10;

public class FileOperationCast {
    public void castFileOperation(FileOperation fileOperation) {
        fileOperation.open();
        fileOperation.read();
        fileOperation.write();
        fileOperation.close();
        fileOperation.delete();

        if (fileOperation instanceof FileOperationDetails) {
            System.out.println("Casting to FileOperationDetails...");
            FileOperationDetails details = (FileOperationDetails) fileOperation;
            details.backup();
        }
    }
}