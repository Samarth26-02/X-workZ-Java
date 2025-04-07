package Assesments10;

public class ContactRunner {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.add();
        contact.view();
        contact.edit();
        contact.delete();
        contact.search();

        System.out.println("----------------------");

        Contact contact1 = new ContactDetails();
        contact1.search();
        contact1.delete();
        contact1.edit();
        contact1.view();
        contact1.add();

        System.out.println("----------------------");

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.add();
        contactDetails.search();
        contactDetails.delete();
        contactDetails.edit();
        contactDetails.view();
        contactDetails.exportToCSV();

        System.out.println("----------------------");

        ContactCast cast = new ContactCast();
        cast.castContact(contact);
        System.out.println("----------------------");
        cast.castContact(contact1);
    }
}
