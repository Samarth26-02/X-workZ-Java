package Assesments10;

public class CompilerCast {
    public void castCompiler(Compiler compiler) {
        compiler.scan();
        compiler.parse();
        compiler.analyze();
        compiler.generateCode();
        compiler.optimize();

        if (compiler instanceof CompilerDetails) {
            System.out.println("Casting to CompilerDetails...");
            CompilerDetails details = (CompilerDetails) compiler;
            details.debugInfo();
        }
    }
}
