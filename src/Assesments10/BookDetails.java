package Assesments10;

public class BookDetails extends Book {
    @Override
    public void read() {
        System.out.println("Read the books");
    }

    @Override
    public void borrow() {
        System.out.println("Borrow the book");
    }

    @Override
    public void returnBook() {
        System.out.println("Return the book");
    }

    @Override
    public void open() {
        System.out.println("Open the book");
    }

    @Override
    public void close() {
        System.out.println("Close the book");
    }

    public void author() {
        System.out.println("Author: R. K. Narayan");
    }
}
