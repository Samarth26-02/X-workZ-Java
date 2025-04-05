// ImageEditorDetails.java
package Assesments10;

public class ImageEditorDetails extends ImageEditor {
    @Override
    public void openImage() {
        System.out.println("Opening image with advanced options");
    }

    @Override
    public void applyFilter() {
        System.out.println("Applying a specific filter");
    }

    @Override
    public void cropImage() {
        System.out.println("Cropping image to precise dimensions");
    }

    @Override
    public void saveImage() {
        System.out.println("Saving image with detailed format settings");
    }

    @Override
    public void undo() {
        System.out.println("Undoing multiple actions");
    }
}