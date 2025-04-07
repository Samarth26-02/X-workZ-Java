package Assesments10;

public class DatabaseDetails extends Database {
    @Override
    public void connect() {
        System.out.println("Connecting to detailed database");
    }

    @Override
    public void query() {
        System.out.println("Executing detailed database query");
    }

    @Override
    public void update() {
        System.out.println("Updating detailed database record");
    }

    @Override
    public void close() {
        System.out.println("Closing detailed database connection");
    }

    @Override
    public void backup() {
        System.out.println("Backing up detailed database");
    }

    public void restore() {
        System.out.println("Restoring detailed database backup");
    }
}
