package Assesments10;

public class TaskRunner {
    public static void main(String[] args) {
        Task task = new Task();
        task.start();
        task.execute();
        task.pause();
        task.resume();
        task.finish();

        System.out.println("-------------");

        Task task1 = new Task();
        task1.start();
        task1.execute();
        task1.pause();
        task1.resume();
        task1.finish();

        System.out.println("-------------");

        TaskDetails taskDetails=new TaskDetails();
        taskDetails.execute();
        taskDetails.pause();
        taskDetails.finish();
        taskDetails.resume();
        taskDetails.start();
    }
}
