package finalproject;

import java.util.LinkedList;

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

}
