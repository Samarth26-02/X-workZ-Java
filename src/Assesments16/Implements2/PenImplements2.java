package Assesments16.Implements2;

import Assesments16.Interfaces.Book;
import Assesments16.Interfaces.Pen;

public class PenImplements2 implements Pen, Book {
    @Override
    public void behaviour() {
        System.out.println("running pen behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running pen identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pen state in implements");
    }
}
