package Assesments10;

public class DatabaseCast {
    public void castDatabase(Database database) {
        database.connect();
        database.query();
        database.update();
        database.backup();
        database.close();

        if (database instanceof DatabaseDetails) {
            System.out.println("Casting to DatabaseDetails...");
            DatabaseDetails details = (DatabaseDetails) database;
            details.restore();
        }
    }
}
