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

    public void displaySortedTasks(){
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
                System.out.println("== SORT BY PRIORITY LEVEL ==");
                System.out.println("==> Assistant: How do you want to sort your task?");
                System.out.println("\t[1] Low to High ");
                System.out.println("\t[2] High to Low");
                System.out.print("Transaction: ");
                int response = input.nextInt();
                line();
                if (response == 1){
                    System.out.println("== LOW TO HIGH ==");
                    sortTasksByPriorityLevelLowToHigh();
                } else if (response == 2) {
                    System.out.println("== HIGH TO LOW ==");
                    sortTasksByPriorityLevelHighToLow();
                } else {
                    System.out.println("Choose only from 1 and 2!");
                }


            } else if (choice == 2) {
                System.out.println("== SORT BY ALPHABETICAL ORDER ==");
                System.out.println("DISPLAY TASK BY");
                System.out.println("\t[1]Ascending");
                System.out.println("\t[2]Descending");
                System.out.print("Transaction: ");
                int response = input.nextInt();

                line();
                if (response == 1){
                    System.out.println("==> ASCENDING ORDER <==");
                    bubbleSortByTaskTitleAscendingOrder();
                    displayTask();
                } else if (response == 2) {
                    System.out.println("==> DESCENDING ORDER <==");
                    bubbleSortByTaskTitleDescendingOrder();
                    displayTask();
                } else {
                    System.out.println("Choose only from 1 and 2. Let's try again!");
                }


            } else if (choice == 3) {
                boolean loop;

                do {
                    loop = false;
                    System.out.println("== SORT BY DEADLINE ==");
                    System.out.println("\t[1] Low to High ");
                    System.out.println("\t[2] High to Low");
                    System.out.print("Transaction: ");
                    int order = input.nextInt();

                    line();
                    System.out.println("\n");
                    if (order == 1) {
                        System.out.println("==> HIGH TO LOW ORDER <==");
                        insertionByTaskDeadline(true);
                        displayTask();
                    } else if (order == 2) {
                        System.out.println("==> LOW TO HIGH ORDER <==");
                        insertionByTaskDeadline(false);
                        displayTask();
                    } else {
                        System.out.println("==> Assistant: Choose only from 1 and 2!");
                        loop = true;
                    }
                } while (loop);

            } else if (choice == 4) {
                System.out.println("== DISPLAY ALL TASK ==");
                displayTask();
            } else {
                System.out.println("Choose only from 1-4. Let's try again!");
            }
        }
    }

    public void sortTasksByPriorityLevelLowToHigh() {
        if (tasks.isEmpty()) {
            System.out.println("==> Assistant: No tasks to sort!");
            return;
        }

        tasks.sort((task1, task2) -> {
            int rank1 = getTaskPriorityRank(task1.getPriorityLevel());
            int rank2 = getTaskPriorityRank(task2.getPriorityLevel());
            return Integer.compare(rank1, rank2);
        });

        displayTask();
    }

    public void sortTasksByPriorityLevelHighToLow() {
        if (tasks.isEmpty()) {
            System.out.println("==> Assistant: No tasks to sort!");
            return;
        }

        tasks.sort((task1, task2) -> {
            int rank1 = getTaskPriorityRank(task1.getPriorityLevel());
            int rank2 = getTaskPriorityRank(task2.getPriorityLevel());
            return Integer.compare(rank2, rank1);
        });

        System.out.println("==> Assistant: Tasks sorted by Priority Level (low, medium, high).");
        displayTask(); // Display the sorted tasks
    }

    private int getTaskPriorityRank(String priorityLevel) {
        switch (priorityLevel.toLowerCase()) {
            case "low": return 1;
            case "medium": return 2;
            case "high": return 3;
            default: return Integer.MAX_VALUE; // Handle unknown priorities
        }
    }


    public void insertionByTaskDeadline(boolean ascending){
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

    public void bubbleSortByTaskTitleAscendingOrder() {
        int n = tasks.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tasks.get(j).getTitle().toUpperCase().compareTo(tasks.get(j + 1).getTitle()) > 0) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortByTaskTitleDescendingOrder() {
        int n = tasks.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tasks.get(j).getTitle().toUpperCase().compareTo(tasks.get(j + 1).getTitle()) < 0) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, temp);
                }
            }
        }
    }

    //Display Task Titles
    public void displayTasks(){
        Scanner input = new Scanner(System.in);
        int counter = 0;


        System.out.println("NOTE: FINISHED TASK (Type (0) to show finished tasks)");
        finishedTaskCounter();

        line();
        System.out.println("\n== Your Task(s) ==");
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
                        boolean loop;
                        do {
                            input.nextLine();
                            System.out.print("Do you want to continue this transaction? (Yes/No): ");
                            String response = input.nextLine();

                            if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
                                System.out.println("==> Gebinib: Invalid input!");
                                loop = true;
                            } else {
                                if (response.equalsIgnoreCase("Yes")) {
                                    System.out.println("Task successfully DELETED!");
                                    tasks.remove(task-1);
                                    pressEnterToContinue();
                                } else {
                                    System.out.println("Transaction Cancelled!");
                                }
                                loop = false;
                            }
                        } while (loop);


                    } else if (choice == 2) {
                        boolean loop;
                        do {
                            input.nextLine();
                            System.out.print("Are you sure do you want to your task to be MARKED AS DONE? (Yes/No): ");
                            String response = input.nextLine();

                            if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
                                System.out.println("==> Gebinib: Invalid input!");
                                loop = true;
                            } else {
                                if (response.equalsIgnoreCase("Yes")){
                                    System.out.println("Task Done!");
                                    Task done = tasks.remove(task-1);
                                    markedAsDone.add(done);
                                } else {
                                    System.out.println("Transaction Cancelled!");
                                }
                                loop = false;
                            }
                        } while (loop);

                    } else if (choice == 3) {
                        System.out.println("FINISHED TASK(s)");
                        if (markedAsDone.isEmpty()){
                            System.out.println("==> Gebinib: No finished task(s) yet!");
                            pressEnterToContinue();
                        } else {
                            finishedTask();
                        }

                    } else {
                        System.out.println("Cancelled....");
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



