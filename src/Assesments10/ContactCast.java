package Assesments10;

public class ContactCast {
    public void castContact(Contact contact) {
        contact.add();
        contact.view();
        contact.edit();
        contact.delete();
        contact.search();

        if (contact instanceof ContactDetails) {
            System.out.println("Casting to ContactDetails...");
            ContactDetails details = (ContactDetails) contact;
            details.exportToCSV();
        }
    }
}
