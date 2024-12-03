package finalproject;

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

    public Subject(String subjectName, String teacher,String subjectId, int credits, int semesterOffered, String fieldStudy, String department, String type) {
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

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(LinkedList<Task> tasks) {
        this.tasks = tasks;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getCredits() {
        return credits;
    }

    public int getSemesterOffered() {
        return semesterOffered;
    }

    public String getFieldStudy() {
        return fieldStudy;
    }

    public String getDepartment() {
        return department;
    }

    public String getType() {
        return type;
    }

    //=====================DISPLAY=====================
    public void display(){
        System.out.println("\n= SUBJECT DETAILS =");
        System.out.println("Subject: " + this.subjectName);
        System.out.println("Teacher: " + this.teacher);
        System.out.println("Credits: " + this.credits);
        System.out.println("Total Semester: " + this.semesterOffered);
        System.out.println("Field Study: " + this.fieldStudy);
        System.out.println("Department: " + this.department);
        System.out.println("Type: " + this.type);

    }


    //Display Task Titles
    public void displayTaskTitle(){
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("NOTE: FINISHED TASK (Type (0) to show finished tasks)");
        finishedTaskCounter();

        for(Task e : tasks){
            counter++;
            line();
            System.out.println("\n==> TASK ["+counter + "] | Title: " + e.getTitle());
            line();
        }

        line();
        System.out.print("\nChoose a Task: ");
        int task = input.nextInt();

        if (task == 0){
            finishedTask();
        } else {
            if (!tasks.isEmpty()){
                line();
                System.out.println("==> TASK DETAILS <==");
                Task chosenTask = tasks.get(task-1);
                chosenTask.display();

                System.out.println("\t[1] Delete Task \n\t[2] Mark as done \n\t[3] Display Finished Tasks");
                System.out.print("Choice: ");
                int choice = input.nextInt();

                if (choice == 1){
                    tasks.remove(counter-1);

                } else if (choice == 2) {
                    Task done = tasks.remove(counter-1);
                    markedAsDone.add(done);

                } else if (choice == 3) {
                    finishedTask();
                }

            } else {
                System.out.println("==> Assistant: Add Task First!");
            }
        }



    }

    public void finishedTask(){
        System.out.println("==> FINISHED TASKS <==");
        for (Task e : markedAsDone){
            e.display();
        }
    }

    public int finishedTaskCounter(){
        return markedAsDone.size();
    }

    //=====================add Tasks=====================
    public void addTask(Task task){
        this.tasks.add(task);
    }

    //=====================Display Tasks from linked list=====================
    public void displayTask(){
        for(Task e : tasks){
            e.display();
        }
    }

    public static void line(){
        for(int i = 0; i < 30; i++){
            System.out.print("==");
        }
    }

    public int taskCounter() {
        return tasks.size();
    }
}



