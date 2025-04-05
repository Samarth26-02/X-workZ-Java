// ProjectDetails.java
package Assesments10;

public class ProjectDetails extends Project {
    @Override
    public void createProject() {
        System.out.println("Creating new project with detailed planning");
    }

    @Override
    public void addTask() {
        System.out.println("Adding task with dependencies and deadlines");
    }

    @Override
    public void assignTask() {
        System.out.println("Assigning task with resource allocation");
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking project progress with burndown charts");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating detailed project status report");
    }
}