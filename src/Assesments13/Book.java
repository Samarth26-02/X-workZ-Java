package Assesments13;

public class Book {
        String title;
        String author;
        int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        @Override
        public String toString() {
            return "Book: \"" + title + "\" by " + author + ", " + pages + " pages";
        }
}
