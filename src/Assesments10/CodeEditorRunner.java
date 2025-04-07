package Assesments10;

public class CodeEditorRunner {
    public static void main(String[] args) {
        CodeEditor editor = new CodeEditor();
        editor.openFile();
        editor.editCode();
        editor.saveFile();
        editor.compileCode();
        editor.runCode();

        System.out.println("----------------------");

        CodeEditor editor1 = new CodeEditorDetails();
        editor1.runCode();
        editor1.compileCode();
        editor1.saveFile();
        editor1.editCode();
        editor1.openFile();

        System.out.println("----------------------");

        CodeEditorDetails editorDetails = new CodeEditorDetails();
        editorDetails.openFile();
        editorDetails.runCode();
        editorDetails.compileCode();
        editorDetails.saveFile();
        editorDetails.editCode();
        editorDetails.debugTools();

        System.out.println("----------------------");

        CodeEditorCast cast = new CodeEditorCast();
        cast.castEditor(editor);
        cast.castEditor(editor1);
    }
}
