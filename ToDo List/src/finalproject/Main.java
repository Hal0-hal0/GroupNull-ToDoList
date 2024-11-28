package finalproject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Subject oop = new Subject("Object-Oriented Programming", "Harder Keia Joy", "CIT 207", 5, 2, "Placeholder", "CICT", "Major");
        Subject dataStructures = new Subject("Data Structures And Algorithm", "Harder Keia Joy", "Placeholder", 20, 2, "Placeholder", "CICT", "Major");
        Subject art = new Subject("Art Appreciation", "Souribio Arturo", "HUM 110", 20, 2, "Placeholder", "CICT", "Major");
        Subject contemporary = new Subject("Contemporary World", "Beleno Ramon B.", "SS 111", 20, 2, "Placeholder", "CICT", "Major");
        Subject ethics = new Subject("Ethics", "Tusiap Andrea L.", "", 3, 11, "Placeholder", "Placeholder", "Placeholder");
        Subject platTech = new Subject("Platform Technologies", "Cadiz Christian", "CIT 206", 3, 1, "Placeholder", "Placeholder", "Placeholder");
        Subject pathfit = new Subject("PATHFIT 3", "Daanoy Christine Joy F", "PATHFIT 3", 3, 1, "Placeholder", "Placeholder", "Placeholder");
        Subject hci = new Subject("Human-Computer Interaction 1", "Payunan Ryan Christian", "PATHFIT 3", 3, 1, "Placeholder", "Placeholder", "Placeholder");

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
        //register();


        while (true){
            System.out.println("\n\n ");
            line();
            System.out.println(" ");


            try{
                System.out.println("Let's organize things up!");
                System.out.println("\t[1] Add Task \n\t[2] Delete and Mark as Done\n\t[3] Search a Task \n\t[4] Update \n\t[5] Display \n\t[6] Summary \n\t[7] Exit");
                System.out.print("Choose a transaction (Type 1): ");
                int transaction = input.nextInt();


                if(transaction == 1){
                    System.out.println("==========> Add Task <==========");
                    System.out.println("Choose a subject:");
                    System.out.println("\t[1] Object Oriented Programming \n\t[2] Data Structure \n\t[3] Art Appreciation \n\t[4] Contemporary World. \n\t[5] Ethics \n\t[6] Platform technology \n\t[7] Pathfit \n\t[8] Human Computer Interaction");
                    System.out.print("Subject: ");
                    int choice = input.nextInt();
                    input.nextLine();

                    if(choice == 1){
                        line();
                        System.out.println("\n== ADD OBJECT ORIENTED PROGRAMMING ==");
                        addTask(oop);

                    } else if (choice == 2) {
                        System.out.println("== ADD DATA STRUCTURES ==");
                        addTask(dataStructures);
                    } else if (choice == 3) {
                        System.out.println("=ADD ART APPRECIATION=");
                        addTask(art);
                    } else if (choice == 4) {
                        System.out.println("=ADD CONTEMPORARY WORLD=");
                        addTask(contemporary);
                    } else if (choice == 5) {
                        System.out.println("=ADD ETHICS=");
                        addTask(ethics);
                    } else if (choice == 6) {
                        System.out.println("=ADD PLATFORM TECHNOLOGY=");
                        addTask(platTech);
                    } else if (choice == 7) {
                        System.out.println("=ADD PATHFIT=");
                        addTask(pathfit);
                    } else if (choice == 8) {
                        System.out.println("=ADD HUMAN COMPUTER INTERACTION=");
                        addTask(hci);
                    }

                } else if (transaction == 2) {
                    System.out.println("==> Delete task and Mark as Done <==");
                    //oop.displayTaskTitle();
                    //Method

                    System.out.println("Choose a subject:");
                    System.out.println("\t[1] Object Oriented Programming \n\t[2] Data Structure \n\t[3] Art Appreciation \n\t[4] Contemporary World. \n\t[5] Ethics \n\t[6] Platform technology \n\t[7] Pathfit \n\t[8] Human Computer Interaction");
                    System.out.print("Subject: ");
                    int choice = input.nextInt();

                    if (choice == 1){
                        oop.displayTaskTitle();
                    }

                } else if (transaction == 3) {
                    System.out.println("Search a task");
                    //Method
                } else if (transaction == 4) {
                    System.out.println("Update");
                    //Method
                } else if (transaction == 5) {
                    System.out.println("Display");
                    //Method
                    //display();

                    Student.displayAllStudent();
                    oop.displayTask();
                    dataStructures.displayTask();
                    pressEnterToContinue();

                } else if (transaction == 6) {
                    System.out.println("Summary");
                } else if (transaction == 7) {
                    input.nextLine();
                    System.out.print("=> Assistant: Are you sure you want to exit the app?\nThis will discard all changes in the app! (Yes/No): ");
                    String answer = input.nextLine();

                    if (answer.equalsIgnoreCase("Yes")){
                        System.out.println("Exiting the app...");
                        break;
                    }else {
                        System.out.println("Returning to menu!");
                        pressEnterToContinue();
                    }
                }
            } catch (Exception e) {
                System.out.println("=> Assistant: Hmmm... Try entering numbers from 1-5 and try again!");
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

            line();
            System.out.println("\n=> REGISTER <=");

            System.out.print("First Name: ");
            String firstName = input.nextLine().toUpperCase();

            System.out.print("Last Name: ");
            String lastName = input.nextLine().toUpperCase();

            System.out.print("Student Id: ");
            String id = input.nextLine().toUpperCase();

            System.out.print("Address: ");
            String address = input.nextLine().toUpperCase();

            char section = 'A';

            do{
                System.out.print("Section (A/B): ");
                section = input.next().toUpperCase().charAt(0);

                if (section == 'A' || section == 'B') {
                    isValid = false;
                    input.nextLine();
                } else {
                    System.out.println("invalid input!");
                    isValid = true;
                }
            }while (isValid);

            System.out.print("Program: ");
            String program = input.nextLine().toUpperCase();

            System.out.print("=> Assistant: Do you want to SAVE this information?(Yes/No): " );
            String ans = input.nextLine();

            if (ans.equalsIgnoreCase("yes")) {
                line();
                System.out.println("\n=> Assistant: Welcome, " + firstName + "!");
                pressEnterToContinue();
                line();

                // Add student
                Student student = new Student(firstName, lastName, id, address, 2, section, program);
                Student.addStudent(student);

                //Create subject
                Subject oop = new Subject("Object-Oriented Programming", "Harder Keia Joy", "CIT 207", 5, 2, "Placeholder", "CICT", "Major");
                Subject dataStructures = new Subject("Data Structures And Algorithm", "Harder Keia Joy", "Placeholder", 20, 2, "Placeholder", "CICT", "Major");
                Subject art = new Subject("Art Appreciation", "Souribio Arturo", "HUM 110", 20, 2, "Placeholder", "CICT", "Major");
                Subject contemporary = new Subject("Contemporary World", "Beleno Ramon B.", "SS 111", 20, 2, "Placeholder", "CICT", "Major");
                Subject ethics = new Subject("Ethics", "Tusiap Andrea L.", "", 3, 11, "Placeholder", "Placeholder", "Placeholder");
                Subject platTech = new Subject("Platform Technologies", "Cadiz Christian", "CIT 206", 3, 1, "Placeholder", "Placeholder", "Placeholder");
                Subject pathfit = new Subject("PATHFIT 3", "Daanoy Christine Joy F", "PATHFIT 3", 3, 1, "Placeholder", "Placeholder", "Placeholder");
                Subject hci = new Subject("Human-Computer Interaction 1", "Payunan Ryan Christian", "PATHFIT 3", 3, 1, "Placeholder", "Placeholder", "Placeholder");

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

        }while (isValid);

    }
    //Menu Methods
    public static void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========> Add Task <==========");
        System.out.println("Choose a subject:");
        System.out.println("\t[1] Object Oriented Programming \n\t[2] Data Structure \n\t[3] Art Appreciation \n\t[4] Contemporary World. \n\t[5] Ethics \n\t[6] Platform technology \n\t[7] Pathfit \n\t[8] Human Computer Interaction");
        System.out.print("Subject: ");
        int choice = input.nextInt();
        input.nextLine();

        if(choice == 1){
            System.out.println("== ADD OBJECT ORIENTED PROGRAMMING ==");
            Subject oop = new Subject("Object-Oriented Programming", "Harder Keia Joy", "CIT 207", 5, 2, "Placeholder", "CICT", "Major");

            addTask(oop);


        }

    }

    public static void addTask(Subject subject){
        Scanner input = new Scanner(System.in);

        line();
        System.out.println("\n== TASK ==");
        System.out.println("Choose a Task:");
        System.out.println("\t[1] Exam \n\t[2] Laboratory \n\t[3] Group Project \n\t[4] Presentation \n\t[5] Assignment");
        System.out.print("Task: ");
        int choice = input.nextInt();

        if (choice == 1){
            line();
            System.out.println("\n== ADD EXAM ==");
            input.nextLine();

            System.out.print("Title: ");
            String title = input.nextLine();


            System.out.print("Priority Level (High, Medium, Low): ");
            String priorityLevel = input.nextLine();


            System.out.print("Due Date: ");
            int dueDate = input.nextInt();
            input.nextLine();

            System.out.print("Month: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Short Description: ");
            String description = input.nextLine();

            System.out.print("Topic: ");
            String topic = input.nextLine();


            System.out.print("Location: ");
            String location = input.nextLine();


            System.out.print("Exam Type (e.g. Quiz, Summative Exam, etc.): ");
            String type = input.nextLine();


            Exam exam = new Exam(title, priorityLevel,dueDate,month,topic,description,subject,location,type);
            subject.addTask(exam);

        } else if (choice == 2) {
            System.out.println("== ADD LABORATORY ==");

            input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Priority Level (High, Medium, Low): ");
            String priorityLevel = input.nextLine();


            System.out.print("Due Date: ");
            int dueDate = input.nextInt();
            input.nextLine();

            System.out.print("Month: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Topic: ");
            String topic = input.nextLine();

            System.out.print("Short Description: ");
            String description = input.nextLine();

            System.out.print("Location: ");
            String location = input.nextLine();

            System.out.print("Do you want to add materials? (yes/no): ");
            String answer = input.nextLine();

            Laboratory lab = new Laboratory(title, priorityLevel,dueDate,month,topic,description,subject,location);
            subject.addTask(lab);

            if (answer.equalsIgnoreCase("yes")){
                System.out.print("Name: ");
                String name = input.nextLine();


                System.out.print("Quantity: ");
                int quantity = input.nextInt();

                Materials materials = new Materials(name, quantity);
                lab.addEquipment(materials);

            } else {
                Materials materials = new Materials("null", 0);
            }


        } else if (choice == 3) {
            System.out.println("== ADD GROUP PROJECT ==");

            input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Priority Level (High, Medium, Low): ");
            String priorityLevel = input.nextLine();


            System.out.print("Due Date: ");
            int dueDate = input.nextInt();
            input.nextLine();

            System.out.print("Month: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Topic: ");
            String topic = input.nextLine();

            System.out.print("Short Description: ");
            String description = input.nextLine();

            System.out.print("Do you want to add materials? (yes/no): ");
            String answer = input.nextLine();

            GroupProject groupProject = new GroupProject(title, priorityLevel,dueDate,month,topic,description,subject);
            subject.addTask(groupProject);

            if (answer.equalsIgnoreCase("yes")){
                System.out.print("Name: ");
                String name = input.nextLine();


                System.out.print("Quantity: ");
                int quantity = input.nextInt();

                Materials materials = new Materials(name, quantity);
                groupProject.addEquipment(materials);

            } else {
                Materials materials = new Materials("null", 0);
            }

        } else if (choice == 4) {
            System.out.println("== ADD PRESENTATION ==");

            input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Priority Level (High, Medium, Low): ");
            String priorityLevel = input.nextLine();


            System.out.print("Due Date: ");
            int dueDate = input.nextInt();
            input.nextLine();

            System.out.print("Month: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Topic: ");
            String topic = input.nextLine();

            System.out.print("Short Description: ");
            String description = input.nextLine();

            System.out.print("Medium (e.g. PowerPoint, Canva, etc.): ");
            String medium = input.nextLine();

            Presentation presentation = new Presentation(title, priorityLevel,dueDate,month,topic,description,subject,medium);
            subject.addTask(presentation);

        } else if (choice == 5) {
            System.out.println("== ADD ASSIGNMENT ==");

            input.nextLine();
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Priority Level(High, Medium, Low): ");
            String priorityLevel = input.nextLine();


            System.out.print("Due Date: ");
            int dueDate = input.nextInt();
            input.nextLine();

            System.out.print("Month: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Topic: ");
            String topic = input.nextLine();

            System.out.print("Short Description: ");
            String description = input.nextLine();

            System.out.print("Format (e.g. Soft copy, Hard copy, etc): ");
            String format = input.nextLine();

            System.out.print("Type (e.g. Essay, Module, etc): ");
            String type = input.nextLine();

            Assignment assignment = new Assignment(title, priorityLevel,dueDate,month,topic,description,subject,format, type);
            subject.addTask(assignment);
        }
    }


    // log out and return to registration
    public static void logOut(){
        System.out.println("LOG-OUT");
        register();
    }
    //Display Methods

    public static void display(Subject subject){
        subject.displayTask();
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