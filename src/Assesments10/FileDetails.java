package Assesments10;

public class FileDetails extends File {
    @Override
    public void open() {
        System.out.println("Opening text file");
    }

    @Override
    public void read() {
        System.out.println("Reading text file contents");
    }

    @Override
    public void write() {
        System.out.println("Writing text to file");
    }

    @Override
    public void close() {
        System.out.println("Closing text file");
    }

    @Override
    public void delete() {
        System.out.println("Deleting text file");
    }
}
