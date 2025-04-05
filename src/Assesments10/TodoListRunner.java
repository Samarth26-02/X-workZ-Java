// TodoListRunner.java
package Assesments10;

public class TodoListRunner {
    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.addTask();
        list.removeTask();
        list.markComplete();
        list.viewTasks();
        list.clearList();

        System.out.println("----------------------");

        TodoList list1 = new TodoListDetails();
        list1.clearList();
        list1.viewTasks();
        list1.markComplete();
        list1.removeTask();
        list1.addTask();

        System.out.println("----------------------");

        TodoListDetails listDetails = new TodoListDetails();
        listDetails.addTask();
        listDetails.clearList();
        listDetails.viewTasks();
        listDetails.markComplete();
        listDetails.removeTask();
    }
}