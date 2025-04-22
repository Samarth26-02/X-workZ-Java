package Assesments17.useclasses;

import Assesments17.interfacecs.Book;

public class Library {
    Book book;

    public Library(Book book){
        this.book=book;
        System.out.println("run book in library..");
    }

    public void execute(){
        if(this.book!=null){
            this.book.read();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
