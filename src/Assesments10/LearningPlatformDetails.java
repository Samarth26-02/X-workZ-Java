// LearningPlatformDetails.java
package Assesments10;

public class LearningPlatformDetails extends LearningPlatform {
    @Override
    public void enrollCourse() {
        System.out.println("Enrolling in a course with prerequisites check");
    }

    @Override
    public void accessMaterial() {
        System.out.println("Accessing interactive learning material");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Submitting assignment with plagiarism check");
    }

    @Override
    public void takeQuiz() {
        System.out.println("Taking a timed quiz with instant feedback");
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking detailed learning progress with performance analytics");
    }
}