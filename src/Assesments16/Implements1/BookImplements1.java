package Assesments16.Implements1;

import Assesments16.Interfaces.Book;

public class BookImplements1 implements Book {
    @Override
    public void behaviour() {
        System.out.println("running book behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running book identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running book state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running book properties in implements");
    }
}
