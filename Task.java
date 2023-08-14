package todolistApp;


public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false; // New task is not completed by default
    }

    public void markCompleted() {
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getName() {
        return name;
    }
}
