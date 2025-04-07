package Assesments10;

public class CompilerRunner {
    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        compiler.scan();
        compiler.parse();
        compiler.analyze();
        compiler.generateCode();
        compiler.optimize();

        System.out.println("----------------------");

        Compiler compiler1 = new CompilerDetails();
        compiler1.optimize();
        compiler1.generateCode();
        compiler1.analyze();
        compiler1.parse();
        compiler1.scan();

        System.out.println("----------------------");

        CompilerDetails compilerDetails = new CompilerDetails();
        compilerDetails.scan();
        compilerDetails.optimize();
        compilerDetails.generateCode();
        compilerDetails.analyze();
        compilerDetails.parse();
        compilerDetails.debugInfo();

        System.out.println("----------------------");

        CompilerCast cast = new CompilerCast();
        cast.castCompiler(compiler);
        System.out.println("----------------------");
        cast.castCompiler(compiler1);
    }
}
