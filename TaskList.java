package todolistApp;

import java.util.*;

public class TaskList {
    ArrayList<Task> tasks = new ArrayList<>();


    public void addTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the task name: ");
        String taskName = in.nextLine(); // Use nextLine() to capture the entire line
        Task newTask = new Task(taskName);
        tasks.add(newTask);
        System.out.println("Task added: " + taskName);
    }

    public void removeTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the task name to remove: ");
        String taskNameToRemove = in.nextLine();
        
        Task taskToRemove = null;
        
        for (Task task : tasks) {
            if (task.getName().equals(taskNameToRemove)) {
                taskToRemove = task;
                break;
            }
        }
        
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed: " + taskNameToRemove);
        } else {
            System.out.println("Task not found: " + taskNameToRemove);
        }
    }

    public void viewTasks() {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - Completed: " + task.isCompleted());
        }
    }
}