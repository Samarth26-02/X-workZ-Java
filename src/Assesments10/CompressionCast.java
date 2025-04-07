package Assesments10;

public class CompressionCast {
    public void castCompression(Compression compression) {
        compression.compress();
        compression.decompress();
        compression.checkRatio();
        compression.setAlgorithm();
        compression.reportSize();

        if (compression instanceof CompressionDetails) {
            System.out.println("Casting to CompressionDetails...");
            CompressionDetails details = (CompressionDetails) compression;
            details.showAlgorithmDetails();
        }
    }
}
