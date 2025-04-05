// PresentationRunner.java
package Assesments10;

public class PresentationRunner {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.createSlide();
        presentation.addContent();
        presentation.applyTransition();
        presentation.startShow();
        presentation.savePresentation();

        System.out.println("----------------------");

        Presentation presentation1 = new PresentationDetails();
        presentation1.savePresentation();
        presentation1.startShow();
        presentation1.applyTransition();
        presentation1.addContent();
        presentation1.createSlide();

        System.out.println("----------------------");

        PresentationDetails presentationDetails = new PresentationDetails();
        presentationDetails.createSlide();
        presentationDetails.savePresentation();
        presentationDetails.startShow();
        presentationDetails.applyTransition();
        presentationDetails.addContent();
    }
}