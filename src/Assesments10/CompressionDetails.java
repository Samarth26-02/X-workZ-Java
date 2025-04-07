package Assesments10;

public class CompressionDetails extends Compression {
    @Override
    public void compress() {
        System.out.println("Compressing file with detailed settings");
    }

    @Override
    public void decompress() {
        System.out.println("Decompressing file with detailed settings");
    }

    @Override
    public void checkRatio() {
        System.out.println("Checking detailed compression ratio");
    }

    @Override
    public void setAlgorithm() {
        System.out.println("Setting detailed compression algorithm");
    }

    @Override
    public void reportSize() {
        System.out.println("Reporting detailed file size");
    }

    public void showAlgorithmDetails() {
        System.out.println("Algorithm: Huffman Coding with run-length optimization");
    }
}
