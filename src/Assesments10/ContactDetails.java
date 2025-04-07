package Assesments10;

public class ContactDetails extends Contact {
    @Override
    public void add() {
        System.out.println("Adding detailed contact information");
    }

    @Override
    public void view() {
        System.out.println("Viewing detailed contact information");
    }

    @Override
    public void edit() {
        System.out.println("Editing detailed contact information");
    }

    @Override
    public void delete() {
        System.out.println("Deleting detailed contact information");
    }

    @Override
    public void search() {
        System.out.println("Searching detailed contact information");
    }

    public void exportToCSV() {
        System.out.println("Exporting contact details to CSV file");
    }
}
