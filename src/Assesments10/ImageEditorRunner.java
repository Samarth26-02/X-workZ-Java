// ImageEditorRunner.java
package Assesments10;

public class ImageEditorRunner {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.openImage();
        editor.applyFilter();
        editor.cropImage();
        editor.saveImage();
        editor.undo();

        System.out.println("----------------------");

        ImageEditor editor1 = new ImageEditorDetails();
        editor1.undo();
        editor1.saveImage();
        editor1.cropImage();
        editor1.applyFilter();
        editor1.openImage();

        System.out.println("----------------------");

        ImageEditorDetails editorDetails = new ImageEditorDetails();
        editorDetails.openImage();
        editorDetails.undo();
        editorDetails.saveImage();
        editorDetails.cropImage();
        editorDetails.applyFilter();
        editorDetails.adjustBrightness();

        System.out.println("----------------------");

        ImageEditorCast editorCast = new ImageEditorCast();
        editorCast.castEditor(editor);
        System.out.println("----------------------");
        editorCast.castEditor(editorDetails);
    }
}