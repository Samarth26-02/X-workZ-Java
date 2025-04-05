package Assesments10;

public class FileOperationDetails extends FileOperation{
    @Override
    public void open() {
        System.out.println("Opening detailed file");
    }

    @Override
    public void read() {
        System.out.println("Reading detailed file content");
    }

    @Override
    public void write() {
        System.out.println("Writing detailed content to file");
    }

    @Override
    public void close() {
        System.out.println("Closing detailed file");
    }

    @Override
    public void delete() {
        System.out.println("Deleting detailed file");
    }
}
