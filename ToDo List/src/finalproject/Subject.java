package finalproject;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Subject {
    private final String subjectName;
    private final String teacher;
    private final String subjectId;
    private final int credits;
    private final int semesterOffered;
    private final String fieldStudy;
    public final String department;
    private final String type;
    private LinkedList<Task> tasks;
    LinkedList<Task> markedAsDone = new LinkedList<>();

    public Subject(String subjectName, String teacher, String subjectId, int credits, int semesterOffered, String fieldStudy, String department, String type) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.subjectId = subjectId;
        this.credits = credits;
        this.semesterOffered = semesterOffered;
        this.fieldStudy = fieldStudy;
        this.department = department;
        this.type = type;
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    //=====================DISPLAY=====================
    public void display() {
        System.out.println("\n= SUBJECT DETAILS =");
        System.out.println("Subject: " + this.subjectName);
        System.out.println("Teacher: " + this.teacher);
        System.out.println("Credits: " + this.credits);
        System.out.println("Total Semester: " + this.semesterOffered);
        System.out.println("Field Study: " + this.fieldStudy);
        System.out.println("Department: " + this.department);
        System.out.println("Type: " + this.type);
    }

    public void displayTask() {
        for (Task task : tasks) {
            task.display();
        }
    }

    //=====================SORTING METHODS=====================
    public void sortTasksByTitle() {
        tasks.sort((task1, task2) -> task1.getTitle().compareToIgnoreCase(task2.getTitle()));
        System.out.println("Tasks sorted by Title:");
        displayTask();
    }

    public void sortTasksByPriority() {
        tasks.sort((task1, task2) -> Integer.compare(task1.getPriority(), task2.getPriority()));
        System.out.println("Tasks sorted by Priority:");
        displayTask();
    }

    public void sortTasksByCompletionStatus() {
        tasks.sort((task1, task2) -> Boolean.compare(task1.isCompleted(), task2.isCompleted()));
        System.out.println("Tasks sorted by Completion Status:");
        displayTask();
    }

    public void sortTasksByDueDate() {
        tasks.sort((task1, task2) -> task1.getDueDate().compareTo(task2.getDueDate()));
        System.out.println("Tasks sorted by Due Date:");
        displayTask();
    }

    //=====================UTILITY METHODS=====================
    public static void line() {
        for (int i = 0; i < 30; i++) {
            System.out.print("==");
        }
        System.out.println();
    }

    //=====================MAIN=====================
    public static void main(String[] args) {
        Subject subject = new Subject("Math", "Dr. Smith", "MTH101", 3, 1, "Mathematics", "Science", "Core");

        // Add tasks
        subject.addTask(new Task("Homework", "Solve problems", LocalDate.of(2024, 12, 1), 2));
        subject.addTask(new Task("Project", "Create a model", LocalDate.of(2024, 12, 10), 1));
        subject.addTask(new Task("Quiz", "Prepare for quiz", LocalDate.of(2024, 11, 30), 3));

        // Menu for sorting
        Scanner input = new Scanner(System.in);
        while (true) {
            line();
            System.out.println("Sorting Options:");
            System.out.println("[1] Sort by Title");
            System.out.println("[2] Sort by Priority");
            System.out.println("[3] Sort by Completion Status");
            System.out.println("[4] Sort by Due Date");
            System.out.println("[5] Display Tasks");
            System.out.println("[0] Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> subject.sortTasksByTitle();
                case 2 -> subject.sortTasksByPriority();
                case 3 -> subject.sortTasksByCompletionStatus();
                case 4 -> subject.sortTasksByDueDate();
                case 5 -> subject.displayTask();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

//=====================TASK CLASS=====================
class Task {
    private final String title;
    private final String description;
    private final LocalDate dueDate;
    private final int priority;
    private boolean completed;

    public Task(String title, String description, LocalDate dueDate, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Priority: " + priority);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
    }
}

