package Assesments10;

public class BookCast {
    public void castBook(Book book) {
        book.borrow();
        book.open();
        book.read();
        book.close();
        book.returnBook();

        if (book instanceof BookDetails) {
            System.out.println("book casting");
            BookDetails details = (BookDetails) book;
            details.author();
        }
    }
}
