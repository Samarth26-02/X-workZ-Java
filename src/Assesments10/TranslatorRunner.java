// TranslatorRunner.java
package Assesments10;

public class TranslatorRunner {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.translateText();
        translator.detectLanguage();
        translator.setSourceLanguage();
        translator.setTargetLanguage();
        translator.swapLanguages();

        System.out.println("----------------------");

        Translator translator1 = new TranslatorDetails();
        translator1.swapLanguages();
        translator1.setTargetLanguage();
        translator1.setSourceLanguage();
        translator1.detectLanguage();
        translator1.translateText();

        System.out.println("----------------------");

        TranslatorDetails translatorDetails = new TranslatorDetails();
        translatorDetails.translateText();
        translatorDetails.swapLanguages();
        translatorDetails.setTargetLanguage();
        translatorDetails.setSourceLanguage();
        translatorDetails.detectLanguage();
    }
}