// SpreadsheetRunner.java
package Assesments10;

public class SpreadsheetRunner {
    public static void main(String[] args) {
        Spreadsheet sheet = new Spreadsheet();
        sheet.createCell();
        sheet.enterData();
        sheet.applyFormula();
        sheet.generateChart();
        sheet.saveWorkbook();

        System.out.println("----------------------");

        Spreadsheet sheet1 = new SpreadsheetDetails();
        sheet1.saveWorkbook();
        sheet1.generateChart();
        sheet1.applyFormula();
        sheet1.enterData();
        sheet1.createCell();

        System.out.println("----------------------");

        SpreadsheetDetails sheetDetails = new SpreadsheetDetails();
        sheetDetails.createCell();
        sheetDetails.saveWorkbook();
        sheetDetails.generateChart();
        sheetDetails.applyFormula();
        sheetDetails.enterData();
    }
}