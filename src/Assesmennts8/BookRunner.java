package Assesmennts8;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        book.setTitle("The Last Tale");//to pass the value call setter method...
        System.out.println("Title of Book is:"+book.getTitle());//to print the value call getter method...
    }
}
