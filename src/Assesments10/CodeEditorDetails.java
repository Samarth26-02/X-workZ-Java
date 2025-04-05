// CodeEditorDetails.java
package Assesments10;

public class CodeEditorDetails extends CodeEditor {
    @Override
    public void openFile() {
        System.out.println("Opening code file with syntax highlighting");
    }

    @Override
    public void editCode() {
        System.out.println("Editing code with auto-completion");
    }

    @Override
    public void saveFile() {
        System.out.println("Saving code file with version control");
    }

    @Override
    public void compileCode() {
        System.out.println("Compiling code with error checking");
    }

    @Override
    public void runCode() {
        System.out.println("Running code in debug mode");
    }
}