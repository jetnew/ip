import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> tasks;
    public TaskList(ArrayList<Task> taskList) {
        this.tasks = taskList;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("You have no remaining tasks! Cheers!");
        } else {
            System.out.println("Here are the tasks in your list:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + "." + tasks.get(i));
            }
        }
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Got it. I've added this task:");
        System.out.println("  " + tasks.get(tasks.size() - 1));
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
    }

    public void setDone(int id) {
        this.tasks.get(id).setDone();
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("  " + tasks.get(id));
    }

    public void deleteTask(int id) {
        Task deletedTask = this.tasks.remove(id);
        System.out.println("Noted. I have removed this task:");
        System.out.println("  " + deletedTask);
    }

}
