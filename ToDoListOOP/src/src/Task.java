package src;

import java.sql.Timestamp;

public class Task {
    private String title;
    private String description;
    private Timestamp deadline;
    private boolean completed;
    private boolean isPriority;
    
    public Task(String title, String description, Timestamp deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
        this.isPriority = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Timestamp getDeadline() { return deadline; }
    public boolean isCompleted() { return completed; }
    public boolean isPriority() { return isPriority; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setDeadline(Timestamp deadline) { this.deadline = deadline; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public void setPriority(boolean isPriority) { this.isPriority = isPriority; }
    
    public void toggleCompleted() {
        this.completed = !this.completed;
    }
}