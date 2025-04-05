package Assesments10;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        database.connect();
        database.query();
        database.update();
        database.close();
        database.backup();

        System.out.println("----------------------");

        Database database1 = new DatabaseDetails();
        database1.backup();
        database1.close();
        database1.update();
        database1.query();
        database1.connect();

        System.out.println("----------------------");

        DatabaseDetails databaseDetails = new DatabaseDetails();
        databaseDetails.connect();
        databaseDetails.backup();
        databaseDetails.close();
        databaseDetails.update();
        databaseDetails.query();
    }
}
