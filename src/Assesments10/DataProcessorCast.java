package Assesments10;

public class DataProcessorCast {
    public void castProcessor(DataProcessor processor) {
        processor.readData();
        processor.validateData();
        processor.transformData();
        processor.analyzeData();
        processor.writeData();

        if (processor instanceof DataProcessorDetails) {
            System.out.println("Casting to DataProcessorDetails...");
            DataProcessorDetails detailed = (DataProcessorDetails) processor;
            detailed.summarizeData();
        }
    }
}
