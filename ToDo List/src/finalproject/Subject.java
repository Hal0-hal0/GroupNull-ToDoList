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

    public void displaySort(){
        Scanner input = new Scanner(System.in);

        if (tasks.isEmpty()){
            System.out.println("==> Assistant: No Pending task(s)!");
        } else {
            System.out.println("==> Assistant: How do you want to sort your task(s)? ");
            System.out.println("\t [1] Priority Level");
            System.out.println("\t [2] Alphabetical Order");
            System.out.println("\t [3] By Deadline");
            System.out.println("\t [4] Display All");
            System.out.print("SORT BY: ");
            int choice = input.nextInt();

            if (choice == 1){
                //sorting method
            } else if (choice == 2) {
                System.out.println("DISPLAY TASK BY");
                System.out.println("\t[1]Ascending");
                System.out.println("\t[2]Descending");
                System.out.print("Transaction: ");
                int response = input.nextInt();

                if (response == 1){
                    System.out.println("==> ASCENDING ORDER <==");
                    bubbleSortByTitle();
                    displayTask();
                } else if (response == 2) {
                    System.out.println("==> DESCENDING ORDER <==");
                    bubbleSortByTitleDescendingOrder();
                    displayTask();
                } else {
                    System.out.println("Choose only from 1 and 2. Let's try again!");
                }


            } else if (choice == 3) {
                boolean loop;

                do {
                    loop = false;
                    System.out.print("Sort Order (1: Ascending, 2: Descending): ");
                    int order = input.nextInt();
                    if (order == 1) {
                        insertionByDeadline(true); // Ascending
                        displayTask();
                    } else if (order == 2) {
                        insertionByDeadline(false); // Descending
                        displayTask();
                    } else {
                        System.out.println("==> Assistant: Choose only from 1 and 2!");
                        loop = true;
                    }
                } while (loop);



            } else if (choice == 4) {
                displayTask();
            } else {
                System.out.println("Choose only from 1-4. Let's try again!");
            }
        }
    }

    public void insertionSortByTitle(){
        int n = tasks.size();
        for (int i = 1; i < n; i++){
            Task key = tasks.get(i);
            int j = i -1;

            while (j >=0 && key.getTitle().compareTo(tasks.get(j).getTitle()) < 0) {
                tasks.set(j + 1, tasks.get(j));
                j = j - 1;
            }
            tasks.set(j + 1, key);
        }
    }

    public void insertionByDeadline(boolean ascending){
        int n  = tasks.size();
        for (int i = 1; i < n; i++){
            Task key = tasks.get(i);
            int j = i - 1;

            while (j >=0 && (ascending ? key.getDueDate() < tasks.get(j).getDueDate() : key.getDueDate() > tasks.get(j).getDueDate())){
                tasks.set(j + 1, tasks.get(j));
                j = j - 1;
            }
            tasks.set(j + 1, key);
        }
    }

    public void bubbleSortByTitle() {
        int n = tasks.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tasks.get(j).getTitle().compareTo(tasks.get(j + 1).getTitle()) > 0) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortByTitleDescendingOrder() {
        int n = tasks.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tasks.get(j).getTitle().compareTo(tasks.get(j + 1).getTitle()) < 0) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, temp);
                }
            }
        }
    }

    //Display Task Titles
    public void displayTaskTitle(){
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("NOTE: FINISHED TASK (Type (0) to show finished tasks)");
        finishedTaskCounter();

        line();
        System.out.println("\n");
        if (tasks.isEmpty()){
            System.out.println("==> Assistant: No pending task(s)!");
        } else {

            for(Task e : tasks){
                counter++;
                System.out.println("==> TASK ["+counter + "] | Title: " + e.getTitle());
            }

            line();
            System.out.print("\nChoose a Task: ");
            int task = input.nextInt();

            if (task == 0){
                finishedTask();
            } else {

                if (!tasks.isEmpty()){
                    line();
                    Task chosenTask = tasks.get(task-1);
                    chosenTask.display();

                    System.out.println("\n== Transaction ==");
                    System.out.println("\t[1] Delete Task \n\t[2] Mark as done \n\t[3] Display Finished Tasks \n\t[4] Exit");
                    System.out.print("Choice: ");
                    int choice = input.nextInt();

                    if (choice == 1){
                        input.nextLine();
                        System.out.print("Do you want to continue this transaction? (Yes/No): ");
                        String response = input.nextLine();


                        if (response.equalsIgnoreCase("Yes")) {
                            System.out.println("Task successfully DELETED!");
                            tasks.remove(task-1);
                            pressEnterToContinue();
                        } else {
                            System.out.println("Transaction Cancelled!");
                            pressEnterToContinue();
                        }

                    } else if (choice == 2) {
                        input.nextLine();
                        System.out.print("Are you sure do you want to your task to be MARKED AS DONE? (Yes/No): ");
                        String response = input.nextLine();

                        if (response.equalsIgnoreCase("Yes")){
                            System.out.println("Task Done!");
                            Task done = tasks.remove(task-1);
                            markedAsDone.add(done);

                            pressEnterToContinue();
                        } else {
                            System.out.println("Transaction Cancelled!");
                            pressEnterToContinue();
                        }

                    } else if (choice == 3) {
                        System.out.println("FINISHED TASK(s)");
                        finishedTask();
                    } else {
                        System.out.println("Cancelled....");
                        pressEnterToContinue();
                    }

                } else {
                    System.out.println("==> Assistant: Add Task First!");
                }

            }
        }





    }

    public void finishedTask(){
        System.out.println("==> FINISHED TASKS <==");
        for (Task e : markedAsDone){
            e.display();
        }
    }

    public int taskSize(){
        return tasks.size();
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
    public static void pressEnterToContinue() {
        System.out.print("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



