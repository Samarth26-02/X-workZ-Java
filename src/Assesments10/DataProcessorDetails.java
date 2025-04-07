package Assesments10;

public class DataProcessorDetails extends DataProcessor {
    @Override
    public void readData() {
        System.out.println("Reading detailed data");
    }

    @Override
    public void validateData() {
        System.out.println("Validating data with details");
    }

    @Override
    public void transformData() {
        System.out.println("Transforming data with details");
    }

    @Override
    public void analyzeData() {
        System.out.println("Analyzing data with details");
    }

    @Override
    public void writeData() {
        System.out.println("Writing detailed data");
    }

    public void summarizeData() {
        System.out.println("Summarizing processed data");
    }
}
