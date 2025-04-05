// LibraryItemRunner.java
package Assesments10;

public class LibraryItemRunner {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem();
        item.borrowItem();
        item.returnItem();
        item.reserveItem();
        item.renewItem();
        item.searchItem();

        System.out.println("----------------------");

        LibraryItem item1 = new LibraryItemDetails();
        item1.searchItem();
        item1.renewItem();
        item1.reserveItem();
        item1.returnItem();
        item1.borrowItem();

        System.out.println("----------------------");

        LibraryItemDetails itemDetails = new LibraryItemDetails();
        itemDetails.borrowItem();
        itemDetails.searchItem();
        itemDetails.renewItem();
        itemDetails.reserveItem();
        itemDetails.returnItem();
    }
}