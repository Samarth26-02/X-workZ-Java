// LearningPlatformRunner.java
package Assesments10;

public class LearningPlatformRunner {
    public static void main(String[] args) {
        LearningPlatform platform = new LearningPlatform();
        platform.enrollCourse();
        platform.accessMaterial();
        platform.submitAssignment();
        platform.takeQuiz();
        platform.trackProgress();

        System.out.println("----------------------");

        LearningPlatform platform1 = new LearningPlatformDetails();
        platform1.trackProgress();
        platform1.takeQuiz();
        platform1.submitAssignment();
        platform1.accessMaterial();
        platform1.enrollCourse();

        System.out.println("----------------------");

        LearningPlatformDetails platformDetails = new LearningPlatformDetails();
        platformDetails.enrollCourse();
        platformDetails.trackProgress();
        platformDetails.takeQuiz();
        platformDetails.submitAssignment();
        platformDetails.accessMaterial();
    }
}