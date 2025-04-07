package Assesments10;

public class FileRunner {
    public static void main(String[] args) {
        File genericFile = new File();
        genericFile.open();
        genericFile.read();
        genericFile.write();
        genericFile.close();
        genericFile.delete();

        System.out.println("-------------");

        File textFile = new FileDetails();
        textFile.open();
        textFile.read();
        textFile.write();
        textFile.close();
        textFile.delete();

        System.out.println("-------------");

        FileDetails fileDetails=new FileDetails();
        fileDetails.open();
        fileDetails.close();
        fileDetails.delete();
        fileDetails.read();
        fileDetails.write();
        fileDetails.encrypt();

        System.out.println("-------------");

        FileCast fileCast = new FileCast();
        fileCast.castFile(genericFile);
        System.out.println("-------------");
        fileCast.castFile(textFile);
    }
}