package Assesments10;

public class CodeEditorCast {
    public void castEditor(CodeEditor editor) {
        editor.openFile();
        editor.editCode();
        editor.saveFile();
        editor.compileCode();
        editor.runCode();

        if (editor instanceof CodeEditorDetails) {
            System.out.println("editor casting");
            CodeEditorDetails details = (CodeEditorDetails) editor;
            details.debugTools();
        }
    }
}
