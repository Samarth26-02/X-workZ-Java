// ProjectRunner.java
package Assesments10;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        project.createProject();
        project.addTask();
        project.assignTask();
        project.trackProgress();
        project.generateReport();

        System.out.println("----------------------");

        Project project1 = new ProjectDetails();
        project1.generateReport();
        project1.trackProgress();
        project1.assignTask();
        project1.addTask();
        project1.createProject();

        System.out.println("----------------------");

        ProjectDetails projectDetails = new ProjectDetails();
        projectDetails.createProject();
        projectDetails.generateReport();
        projectDetails.trackProgress();
        projectDetails.assignTask();
        projectDetails.addTask();
    }
}