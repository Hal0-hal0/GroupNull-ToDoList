package finalproject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //To add equipment (if a subject needs equipment/materials)
//        lab1.addEquipment(mat1);


        //To add subject inside the linked list of Student (Okay na ni)
//        student1.addSubject(oop);
//        student1.addSubject(dataStructures);
//        student1.addSubject(art);
//        student1.addSubject(contemporary);
//        student1.addSubject(ethics);
//        student1.addSubject(platTech);
//        student1.addSubject(pathfit);
//        student1.addSubject(hci);

        //To add task in a subject
        // subjectName.addTask(task variable);
//        oop.addTask(lab1);


// To display student,subject and task
//        student1.display();
//        lab1.getSubject().display();
//        oop.displayTask();
//        System.out.println("=====================");

//        student1.displaySubject();

        //====================== MENU =======================================
        line();
        System.out.println(" ");
        System.out.println("                       TO-DO LIST APP");
        line();
        System.out.println(" ");
        pressEnterToContinue();
        register();

        while (true){
            System.out.println("\n\n ");
            line();
            System.out.println(" ");


            try{
                System.out.println("Let's organize things up!");
                System.out.println("[1] Add Task \n[2] Delete Task\n[3] Search a Task \n[4] Update \n[5] Display \n[6] Log out \n[7] Exit");
                System.out.print("Choose a transaction (Type 1): ");
                int transaction = input.nextInt();

                if(transaction == 1){
                    System.out.println("Add Task");
                    //Method
                    add();
                } else if (transaction == 2) {
                    System.out.println("Delete task");
                    //Method
                } else if (transaction == 3) {
                    System.out.println("Search a task");
                    //Method
                } else if (transaction == 4) {
                    System.out.println("Update");
                    //Method
                } else if (transaction == 5) {
                    System.out.println("Display");
                    //Method
                    display();
                } else if (transaction == 6) {
                    System.out.println("Logged out successfully!");
                    pressEnterToContinue();
                    register();
                } else if (transaction == 7) {
                    System.out.println("Exiting the app...");
                    pressEnterToContinue();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Tata: Hmmm... Try entering numbers from 1-5 and try again!");
                pressEnterToContinue();
            }
        }

    }
    //========================== METHODS ===========================
    //Login / Registration
    public static void register() {
        Scanner input = new Scanner(System.in);



        // REGISTRATION
        boolean isValid = false;
        do{
            try {

                System.out.println("REGISTER");
                System.out.println("Register as: \n[1] Student \n[2] Admin ");
                System.out.print("Transaction: ");
                int register = input.nextInt();
                input.nextLine();

                System.out.println("You selected " + register);

                if (register == 1){
                    line();

                    System.out.print("\nFirst Name: ");
                    String firstName = input.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = input.nextLine();

                    System.out.print("Student Id: ");
                    String id = input.nextLine();

                    System.out.print("Address: ");
                    String address = input.nextLine();

                    char section = 'A';
                    while (!isValid) {
                        System.out.print("Section (A/B): ");
                        section = input.next().toUpperCase().charAt(0);

                        if (section == 'A' || section == 'B') {
                            isValid = true;
                            input.nextLine();
                        } else {
                            System.out.println("invalid input!");
                        }
                    }

                    System.out.print("Program: ");
                    String program = input.nextLine().toUpperCase();

                    System.out.println("Do you want to try again?: " );
                    String ans = input.nextLine();
                    if (ans.equalsIgnoreCase("no")){
                        System.out.println("Assistant: Welcome, " + firstName + "!");
                        pressEnterToContinue();
                        line();

                        // Add student
                        Student student = new Student(firstName, lastName, id, address, 2, section, program);
                        Student.addStudent(student);

                        //Create subject
                        Subject oop = new Subject("Object-Oriented Programming","Harder Keia Joy","CIT 207",5,2,"Placeholder","CICT","Major");
                        Subject dataStructures = new Subject("Data Structures And Algorithm","Harder Keia Joy","Placeholder",20,2,"Placeholder","CICT","Major");
                        Subject art = new Subject("Art Appreciation","Souribio Arturo","HUM 110",20,2,"Placeholder","CICT","Major");
                        Subject contemporary = new Subject("Contemporary World","Beleno Ramon B.","SS 111",20,2,"Placeholder","CICT","Major");
                        Subject ethics = new Subject("Ethics","Tusiap Andrea L.","",3, 11,"Placeholder","Placeholder","Placeholder");
                        Subject platTech = new Subject("Platform Technologies","Cadiz Christian","CIT 206",3,1,"Placeholder","Placeholder","Placeholder");
                        Subject pathfit = new Subject("PATHFIT 3","Daanoy Christine Joy F","PATHFIT 3",3,1,"Placeholder","Placeholder","Placeholder");
                        Subject hci = new Subject("Human-Computer Interaction 1","Payunan Ryan Christian","PATHFIT 3",3,1,"Placeholder","Placeholder","Placeholder");

                        student.addSubject(oop);
                        student.addSubject(dataStructures);
                        student.addSubject(art);
                        student.addSubject(contemporary);
                        student.addSubject(ethics);
                        student.addSubject(platTech);
                        student.addSubject(pathfit);
                        student.addSubject(hci);

                        Student.displayAllStudent();
                        //student.displaySubject();
                        System.out.println(" ");
                        isValid = false;
                    }else {
                        isValid = true;
                    }


                }

            } catch (Exception e) {
                System.out.println("Invalid Input!");
            }

        }while (isValid);



    }

    //Menu Methods
    public static void add(){
        System.out.println("Add Task");
        System.out.println("Choose a subject");
        System.out.println("1. OOP \n2. Data Struct");
        System.out.println("Choice: ");

    }
    // log out and return to registration
    public static void logOut(){
        System.out.println("LOG-OUT");
        register();
    }
    //Display Methods

    public static void display(){

    }



// Methods for design purposes
    public static void pressEnterToContinue() {
        System.out.print("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void line(){
        for(int i = 0; i < 30; i++){
            System.out.print("==");
        }
    }

}