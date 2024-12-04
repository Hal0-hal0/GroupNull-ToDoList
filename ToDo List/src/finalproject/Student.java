package finalproject;

import java.util.LinkedList;

public class Student {
    private  String firstName;
    private  String lastName;
    private  String studentId;
    private  String address;
    private  int yearLevel;
    private  char section;
    private  String program;
    private LinkedList<Subject> subject;

    public static LinkedList<Student> studentList = new LinkedList<>();

    public Student(String firstName, String lastName, String studentId, String address, int yearLevel, char section, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.address = address;
        this.yearLevel = yearLevel;
        this.section = section;
        this.program = program;
        this.subject =new LinkedList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public LinkedList<Subject> getSubject() {
        return subject;
    }

    public void setSubject(LinkedList<Subject> subject) {
        this.subject = subject;
    }

    // ========================Get Full Name=============================
    public String getFullName(){
        return this.lastName +", "+ this.firstName;
    }

    // ========================Display=============================
    public void display(){
        System.out.println("\n= STUDENT DETAILS =");
        System.out.println("\tFull Name: " + this.getFullName());
        System.out.println("\tID: " + this.studentId);
        System.out.println("\tAddress: " + this.address);
        System.out.println("\tYear Level: " + this.yearLevel);
        System.out.println("\tSection: " + this.section);
        System.out.println("\tProgram: "  + this.program);

    }

    //Add Student
    public static void addStudent(Student students){
        studentList.add(students);
    }

    //Display Student
    public static void displayAllStudent(){
        for(Student e : studentList){
            e.display();
        }
    }

    // ========================Add in Linked List=============================
    public void addSubject(Subject subject){
        this.subject.add(subject);
    }
    // ========================Display Linked List=============================
    public void displaySubject(){
        for(Subject e : subject){
            e.display();
        }
    }


}
