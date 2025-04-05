// CompilerDetails.java
package Assesments10;

public class CompilerDetails extends Compiler {
    @Override
    public void scan() {
        System.out.println("Scanning code with details");
    }

    @Override
    public void parse() {
        System.out.println("Parsing code with details");
    }

    @Override
    public void analyze() {
        System.out.println("Analyzing code with details");
    }

    @Override
    public void generateCode() {
        System.out.println("Generating detailed machine code");
    }

    @Override
    public void optimize() {
        System.out.println("Optimizing code with details");
    }
}