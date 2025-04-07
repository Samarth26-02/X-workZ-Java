package Assesments10;

public class DocumentRunner {
    public static void main(String[] args) {
        Document genericDocument = new Document();
        genericDocument.create();
        genericDocument.open();
        genericDocument.edit();
        genericDocument.save();
        genericDocument.print();

        System.out.println("-------------");

        DocumentDetails wordDocument = new DocumentDetails();
        wordDocument.create();
        wordDocument.open();
        wordDocument.edit();
        wordDocument.save();
        wordDocument.print();
        wordDocument.convertToPDF();

        System.out.println("-------------");

        Document document = new Document();
        document.create();
        document.open();
        document.edit();
        document.print();
        document.save();

        System.out.println("-------------");

        DocumentCast docCast = new DocumentCast();
        docCast.castDocument(document);  // no PDF conversion
        System.out.println("-------------");
        docCast.castDocument(wordDocument);  // with PDF conversion
    }
}
