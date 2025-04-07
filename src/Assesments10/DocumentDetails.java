package Assesments10;

public class DocumentDetails extends Document {
    @Override
    public void create() {
        System.out.println("Creating Word document");
    }

    @Override
    public void open() {
        System.out.println("Opening Word document");
    }

    @Override
    public void edit() {
        System.out.println("Editing Word document");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document");
    }

    @Override
    public void print() {
        System.out.println("Printing Word document");
    }

    public void convertToPDF() {
        System.out.println("Converting Word document to PDF");
    }
}
