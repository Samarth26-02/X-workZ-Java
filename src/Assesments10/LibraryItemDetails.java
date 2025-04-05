// LibraryItemDetails.java
package Assesments10;

public class LibraryItemDetails extends LibraryItem {
    @Override
    public void borrowItem() {
        System.out.println("Borrowing library item with due date");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning library item and checking for fines");
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving library item with notification preference");
    }

    @Override
    public void renewItem() {
        System.out.println("Renewing library item for an extended period");
    }

    @Override
    public void searchItem() {
        System.out.println("Searching for library item with advanced filters");
    }
}