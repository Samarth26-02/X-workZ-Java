// SpreadsheetDetails.java
package Assesments10;

public class SpreadsheetDetails extends Spreadsheet {
    @Override
    public void createCell() {
        System.out.println("Creating new cell with advanced formatting");
    }

    @Override
    public void enterData() {
        System.out.println("Entering complex data into cell");
    }

    @Override
    public void applyFormula() {
        System.out.println("Applying advanced formula to cell range");
    }

    @Override
    public void generateChart() {
        System.out.println("Generating interactive chart from data");
    }

    @Override
    public void saveWorkbook() {
        System.out.println("Saving spreadsheet workbook with macros");
    }
}