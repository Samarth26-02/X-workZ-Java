package Assesments10;

public class DocumentCast {
    public void castDocument(Document doc) {
        doc.create();
        doc.open();
        doc.edit();
        doc.save();
        doc.print();

        if (doc instanceof DocumentDetails) {
            System.out.println("Casting to DocumentDetails...");
            DocumentDetails details = (DocumentDetails) doc;
            details.convertToPDF();
        }
    }
}
