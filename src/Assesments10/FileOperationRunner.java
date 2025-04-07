package Assesments10;

public class FileOperationRunner {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        fileOperation.open();
        fileOperation.read();
        fileOperation.write();
        fileOperation.close();
        fileOperation.delete();

        System.out.println("----------------------");

        FileOperation fileOperation1 = new FileOperationDetails();
        fileOperation1.delete();
        fileOperation1.close();
        fileOperation1.write();
        fileOperation1.read();
        fileOperation1.open();

        System.out.println("----------------------");

        FileOperationDetails fileOperationDetails = new FileOperationDetails();
        fileOperationDetails.open();
        fileOperationDetails.delete();
        fileOperationDetails.close();
        fileOperationDetails.write();
        fileOperationDetails.read();
        fileOperationDetails.backup();

        System.out.println("----------------------");

        FileOperationCast fileOperationCast = new FileOperationCast();
        fileOperationCast.castFileOperation(fileOperation);
        System.out.println("----------------------");
        fileOperationCast.castFileOperation(fileOperationDetails);
    }
}