// TodoListDetails.java
package Assesments10;

public class TodoListDetails extends TodoList {
    @Override
    public void addTask() {
        System.out.println("Adding detailed task to list");
    }

    @Override
    public void removeTask() {
        System.out.println("Removing detailed task from list");
    }

    @Override
    public void markComplete() {
        System.out.println("Marking detailed task as complete");
    }

    @Override
    public void viewTasks() {
        System.out.println("Viewing detailed tasks in list");
    }

    @Override
    public void clearList() {
        System.out.println("Clearing the detailed list");
    }
}