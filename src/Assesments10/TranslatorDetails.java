// TranslatorDetails.java
package Assesments10;

public class TranslatorDetails extends Translator {
    @Override
    public void translateText() {
        System.out.println("Translating text with detailed options");
    }

    @Override
    public void detectLanguage() {
        System.out.println("Detecting language with detailed analysis");
    }

    @Override
    public void setSourceLanguage() {
        System.out.println("Setting detailed source language");
    }

    @Override
    public void setTargetLanguage() {
        System.out.println("Setting detailed target language");
    }

    @Override
    public void swapLanguages() {
        System.out.println("Swapping detailed languages");
    }
}