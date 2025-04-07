package Assesments10;

public class ImageEditorCast {
    public void castEditor(ImageEditor editor) {
        editor.openImage();
        editor.applyFilter();
        editor.cropImage();
        editor.saveImage();
        editor.undo();

        if (editor instanceof ImageEditorDetails) {
            System.out.println("Casting to ImageEditorDetails...");
            ImageEditorDetails details = (ImageEditorDetails) editor;
            details.adjustBrightness();
        }
    }
}