// PresentationDetails.java
package Assesments10;

public class PresentationDetails extends Presentation {
    @Override
    public void createSlide() {
        System.out.println("Creating new slide with advanced layouts");
    }

    @Override
    public void addContent() {
        System.out.println("Adding rich media content to slide");
    }

    @Override
    public void applyTransition() {
        System.out.println("Applying dynamic slide transition");
    }

    @Override
    public void startShow() {
        System.out.println("Starting interactive presentation");
    }

    @Override
    public void savePresentation() {
        System.out.println("Saving presentation with embedded fonts");
    }
}