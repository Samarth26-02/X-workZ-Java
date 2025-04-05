// CompressionRunner.java
package Assesments10;

public class CompressionRunner {
    public static void main(String[] args) {
        Compression compression = new Compression();
        compression.compress();
        compression.decompress();
        compression.checkRatio();
        compression.setAlgorithm();
        compression.reportSize();

        System.out.println("----------------------");

        Compression compression1 = new CompressionDetails();
        compression1.reportSize();
        compression1.setAlgorithm();
        compression1.checkRatio();
        compression1.decompress();
        compression1.compress();

        System.out.println("----------------------");

        CompressionDetails compressionDetails = new CompressionDetails();
        compressionDetails.compress();
        compressionDetails.reportSize();
        compressionDetails.setAlgorithm();
        compressionDetails.checkRatio();
        compressionDetails.decompress();
    }
}