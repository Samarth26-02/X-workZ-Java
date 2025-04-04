package Assesments10;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        book.borrow();
        book.open();
        book.read();
        book.close();
        book.returnBook();
        System.out.println("---------------");
        Book book1=new BookDetails();
        book1.borrow();
        book1.open();
        book1.read();
        book1.close();
        book1.returnBook();
        System.out.println("---------------");
        BookDetails bookDetails=new BookDetails();
        bookDetails.borrow();
        bookDetails.open();
        bookDetails.returnBook();
        bookDetails.read();
        bookDetails.close();
    }
}
