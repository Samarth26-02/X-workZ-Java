// DataProcessorRunner.java
package Assesments10;

public class DataProcessorRunner {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.readData();
        processor.validateData();
        processor.transformData();
        processor.analyzeData();
        processor.writeData();

        System.out.println("----------------------");

        DataProcessor processor1 = new DataProcessorDetails();
        processor1.writeData();
        processor1.analyzeData();
        processor1.transformData();
        processor1.validateData();
        processor1.readData();

        System.out.println("----------------------");

        DataProcessorDetails processorDetails = new DataProcessorDetails();
        processorDetails.readData();
        processorDetails.writeData();
        processorDetails.analyzeData();
        processorDetails.transformData();
        processorDetails.validateData();
    }
}