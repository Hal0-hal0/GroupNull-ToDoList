package finalproject;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.LinkedList;

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

        //DONT DELETE THESE COMMENTS! hihi


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
        System.out.println("                           TO-DO LIST APP");
        line();
        System.out.println(" ");
        pressEnterToContinue();
        register();
        clear();

        while (true) {
            clear();
            System.out.println("\n ");
            line();
            System.out.println(" ");

            try {
                System.out.println("Let's organize things up!");
                System.out.println("\t[1] Add Task \n\t[2] Delete and Mark as Done\n\t[3] Edit/Update \n\t[4] Display\n\t[5] Exit");
                System.out.print("Choose a transaction (Type 1): ");
                int transaction = input.nextInt();
                clear();

                if (transaction == 1) {
                    line();
                    System.out.println("\n==> ADD TASK <==");
                    System.out.println("Instruction: Choose a subject");
                    System.out.println("\t[1] Object Oriented Programming \n\t[2] Data Structures and Algorithms \n\t[3] Art Appreciation \n\t[4] Contemporary World \n\t[5] Ethics \n\t[6] Platform technology \n\t[7] Pathfit \n\t[8] Human Computer Interaction");
                    line();

                    System.out.print("\nSubject: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    clear();

                    if (choice == 1) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD OBJECT ORIENTED PROGRAMMING");
                        addTask(oop);

                    } else if (choice == 2) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD DATA STRUCTURES");
                        addTask(dataStructures);
                    } else if (choice == 3) {
                        System.out.println("\n==> SUBJECT: ADD ART APPRECIATION");
                        addTask(art);
                    } else if (choice == 4) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD CONTEMPORARY WORLD");
                        addTask(contemporary);
                    } else if (choice == 5) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD ETHICS");
                        addTask(ethics);
                    } else if (choice == 6) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n ==> SUBJECT: ADD PLATFORM TECHNOLOGY");
                        addTask(platTech);
                    } else if (choice == 7) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD PATHFIT");
                        addTask(pathfit);
                    } else if (choice == 8) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD HUMAN COMPUTER INTERACTION");
                        addTask(hci);
                    } else {
                        System.out.println("==> Assistant: Choose only from 1-8!");
                        pressEnterToContinue();
                        clear();
                    }

                } else if (transaction == 2) {
                    clear();
                    line();

                    System.out.println("\n                     ==> DELETE AND MARK AS DONE <==");
                    System.out.println("Instruction: Choose a subject that you want to DELETE and MARK AS DONE.");
                    System.out.println("             To cancel the transaction press (0)");
                    thinLine();
                    System.out.println("\n\t    SUBJECT NAME                 | PENDING | FINISHED");
                    System.out.println("\t[1] Object Oriented Programming " + " |    " + oop.taskCounter() + "         " + oop.finishedTaskCounter());
                    System.out.println("\t[2] Data Structure  " + "             |    " + dataStructures.taskCounter() + "         " + dataStructures.finishedTaskCounter());
                    System.out.println("\t[3] Art Appreciation" + "             |    " + art.taskCounter() + "         " + art.finishedTaskCounter());
                    System.out.println("\t[4] Contemporary World " + "          |    " + contemporary.taskCounter() + "         " + contemporary.finishedTaskCounter());
                    System.out.println("\t[5] Ethics " + "                      |    " + ethics.taskCounter() + "         " + ethics.finishedTaskCounter());
                    System.out.println("\t[6] Platform technology " + "         |    " + platTech.taskCounter() + "         " + platTech.finishedTaskCounter());
                    System.out.println("\t[7] Pathfit " + "                     |    " + pathfit.taskCounter() + "         " + pathfit.finishedTaskCounter());
                    System.out.println("\t[8] Human Computer Interaction " + "  |    " + hci.taskCounter() + "         " + hci.finishedTaskCounter());
                    thinLine();

                    System.out.print("\nSubject: ");
                    int choice = input.nextInt();

                    line();
                    System.out.println("\n== DELETE AND MARK AS DONE ==");
                    if (choice == 1) {
                        System.out.println("==> OBJECT ORIENTED PROGRAMMING");
                        oop.displayTaskTitle();
                    } else if (choice == 2) {
                        System.out.println("==> DATA STRUCTURES AND ALGORITHM");
                        dataStructures.displayTaskTitle();
                    } else if (choice == 3) {
                        System.out.println("==> ART APPRECIATION");
                        art.displayTaskTitle();
                    } else if (choice == 4) {
                        System.out.println("==> CONTEMPORARY WORLD");
                        contemporary.displayTaskTitle();
                    } else if (choice == 5) {
                        System.out.println("==> ETHICS");
                        ethics.displayTaskTitle();
                    } else if (choice == 6) {
                        System.out.println("==> PLATFORM TECHNOLOGIES");
                        platTech.displayTaskTitle();
                    } else if (choice == 7) {
                        System.out.println("==> PATHFIT");
                        pathfit.displayTaskTitle();
                    } else if (choice == 8) {
                        System.out.println("==> HUMAN COMPUTER INTERACTION");
                        hci.displayTaskTitle();
                    } else if (choice == 0) {
                        System.out.println("Transaction cancelled!");
                    } else {
                        System.out.println("=> Assistant: Choose only from 1-8!");
                    }

                    pressEnterToContinue();
                } else if (transaction == 3) {
                    clear();
                    line();

                    System.out.println("\n                          ==> UPDATE TASK <==");
                    System.out.println("Instruction: Choose a subject that you want to DELETE and MARK AS DONE.");
                    System.out.println("             To cancel the transaction press (0)");
                    thinLine();
                    System.out.println("\n\t    SUBJECT NAME                 | PENDING | FINISHED");
                    System.out.println("\t[1] Object Oriented Programming " + " |    " + oop.taskCounter() + "         " + oop.finishedTaskCounter());
                    System.out.println("\t[2] Data Structure  " + "             |    " + dataStructures.taskCounter() + "         " + dataStructures.finishedTaskCounter());
                    System.out.println("\t[3] Art Appreciation" + "             |    " + art.taskCounter() + "         " + art.finishedTaskCounter());
                    System.out.println("\t[4] Contemporary World " + "          |    " + contemporary.taskCounter() + "         " + contemporary.finishedTaskCounter());
                    System.out.println("\t[5] Ethics " + "                      |    " + ethics.taskCounter() + "         " + ethics.finishedTaskCounter());
                    System.out.println("\t[6] Platform technology " + "         |    " + platTech.taskCounter() + "         " + platTech.finishedTaskCounter());
                    System.out.println("\t[7] Pathfit " + "                     |    " + pathfit.taskCounter() + "         " + pathfit.finishedTaskCounter());
                    System.out.println("\t[8] Human Computer Interaction " + "  |    " + hci.taskCounter() + "         " + hci.finishedTaskCounter());
                    thinLine();

                    System.out.print("\nSubject: ");
                    int choice = input.nextInt();

                    line();
                    System.out.println("\n== UPDATE TASK ==");
                    if (choice == 1) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: UPDATE OBJECT ORIENTED PROGRAMMING");
                        updateTask(oop);

                    } else if (choice == 2) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: UPDATE DATA STRUCTURES");
                        updateTask(dataStructures);
                    } else if (choice == 3) {
                        System.out.println("=ADD ART APPRECIATION=");
                        updateTask(art);
                    } else if (choice == 4) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD CONTEMPORARY WORLD=");
                        updateTask(contemporary);
                    } else if (choice == 5) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n==> SUBJECT: ADD ETHICS=");
                        updateTask(ethics);
                    } else if (choice == 6) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("\n ==> SUBJECT: ADD PLATFORM TECHNOLOGY=");
                        updateTask(platTech);
                    } else if (choice == 7) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("==> SUBJECT: ADD PATHFIT");
                        updateTask(pathfit);
                    } else if (choice == 8) {
                        System.out.println("\n\n");
                        line();
                        System.out.println("==> SUBJECT: ADD HUMAN COMPUTER INTERACTION=");
                        updateTask(hci);
                    }
                    pressEnterToContinue();

                } else if (transaction == 4) {
                    line();

                    System.out.println("\n                          ==> DISPLAY <==");
                    System.out.println("Instruction: Choose a subject that you want to DELETE and MARK AS DONE.");
                    System.out.println("             To cancel the transaction press (0)");
                    thinLine();
                    System.out.println("\n\t    SUBJECT NAME                 | PENDING | FINISHED");
                    System.out.println("\t[1] Object Oriented Programming " + " |    " + oop.taskCounter() + "         " + oop.finishedTaskCounter());
                    System.out.println("\t[2] Data Structure  " + "             |    " + dataStructures.taskCounter() + "         " + dataStructures.finishedTaskCounter());
                    System.out.println("\t[3] Art Appreciation" + "             |    " + art.taskCounter() + "         " + art.finishedTaskCounter());
                    System.out.println("\t[4] Contemporary World " + "          |    " + contemporary.taskCounter() + "         " + contemporary.finishedTaskCounter());
                    System.out.println("\t[5] Ethics " + "                      |    " + ethics.taskCounter() + "         " + ethics.finishedTaskCounter());
                    System.out.println("\t[6] Platform technology " + "         |    " + platTech.taskCounter() + "         " + platTech.finishedTaskCounter());
                    System.out.println("\t[7] Pathfit " + "                     |    " + pathfit.taskCounter() + "         " + pathfit.finishedTaskCounter());
                    System.out.println("\t[8] Human Computer Interaction " + "  |    " + hci.taskCounter() + "         " + hci.finishedTaskCounter());
                    System.out.println("\t[9] Display Student Details");
                    thinLine();

                    System.out.print("\nSubject: ");
                    int choice = input.nextInt();

                    line();
                    System.out.println("\n== DISPLAY TASK ==");
                    if (choice == 1) {
                        System.out.println("==> DISPLAY OBJECT ORIENTED PROGRAMMING");
                        oop.displaySort();
                    } else if (choice == 2) {
                        System.out.println("==> DISPLAY DATA STRUCTURES");
                        dataStructures.displaySort();

                    } else if (choice == 3) {
                        System.out.println("==> DISPLAY ART APPRECIATION");
                        art.displaySort();

                    } else if (choice == 4) {
                        System.out.println("==> DISPLAY CONTEMPORARY WORLD");
                        contemporary.displaySort();

                    } else if (choice == 5) {
                        System.out.println("==> DISPLAY ETHICS");
                        ethics.displaySort();

                    } else if (choice == 6) {
                        System.out.println("==> DISPLAY PLATFORM TECHNOLOGIES");
                        platTech.displaySort();

                    } else if (choice == 7) {
                        System.out.println("==> DISPLAY PATHFIT");
                        pathfit.displaySort();

                    } else if (choice == 8) {
                        System.out.println("==> DISPLAY HUMAN COMPUTER INTERACTION");
                        hci.displaySort();

                    } else if (choice == 9) {
                        if (Student.studentList.isEmpty()){
                            System.out.println("No student registered!");
                        } else {
                            Student.displayAllStudent();
                        }

                    } else if (choice == 0) {
                        System.out.println("Transaction cancelled!");
                    } else {
                        System.out.println("=> Assistant: Choose only from 1-8!");
                    }

                    pressEnterToContinue();

                } else if (transaction == 5) {
                    input.nextLine();
                    System.out.print("=> Assistant: Are you sure you want to exit the app?\nThis will discard all changes in the app! (Yes/No): ");
                    String answer = input.nextLine();

                    if (answer.equalsIgnoreCase("Yes")) {
                        System.out.println("Exiting the app...");
                        break;
                    } else {
                        System.out.println("Returning to menu!");
                        pressEnterToContinue();
                    }
                } else {
                    System.out.println("==> Assistant: Please choose only from 1-5!");
                    pressEnterToContinue();
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
        //make this all required
        boolean isValid;
        do {
            isValid = false;

            line();
            System.out.println("\n=> REGISTER <=");
            System.out.println("==> Assistant: Let's register you first!");

            String firstName;
            do {
                System.out.print("\tFirst Name*: ");
                firstName = input.nextLine().toUpperCase();
            } while (firstName.isEmpty());

            String lastName;
            do {
                System.out.print("\tLast Name*: ");
                lastName = input.nextLine().toUpperCase();
            } while (lastName.isEmpty());


            String id;
            do {
                System.out.print("\tStudent Id*: ");
                id = input.nextLine().toUpperCase();
            } while (id.isEmpty());


            String address;
            do {
                System.out.print("\tAddress (Street/Barangay, Municipality, City)*: ");
                address = input.nextLine().toUpperCase();

            } while (address.isEmpty());


            char section = 'A';

            do {
                System.out.print("\tSection (A/B)*: ");
                section = input.next().toUpperCase().charAt(0);

                if (section == 'A' || section == 'B') {
                    isValid = false;
                    input.nextLine();
                } else {
                    System.out.println("invalid input!");
                    isValid = true;
                }
            } while (isValid);

            String program;
            do {
                System.out.print("\tProgram*: ");
                program = input.nextLine().toUpperCase();

                if (!program.equalsIgnoreCase("BSIT")){
                    System.out.println("==> Assistant: Invalid program!");
                    program = "";
                }
            } while (program.isEmpty());


            System.out.print("=> Assistant: Do you want to SAVE this information?(Yes/No): ");
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
                System.out.println(" ");
                isValid = false;

            } else {
                isValid = true;
            }

        } while (isValid);

    }

    //Menu Methods

    public static void addTask(Subject subject) {
        Scanner input = new Scanner(System.in);

        boolean loop;
        String response;

        System.out.println("Choose a Task Type:");
        System.out.println("\t[1] Exam \n\t[2] Laboratory \n\t[3] Group Project \n\t[4] Presentation \n\t[5] Assignment/Project");
        line();
        System.out.print("\nTask (e.g. 1): ");
        int choice = input.nextInt();

        if (choice == 1) { //EXAM
            do {
                loop = false;
                input.nextLine();
                line();
                System.out.println("\n== ADD EXAM ==");
                System.out.println("Instruction(s): You can now add Exam as Task! ");



                String title;
                do {
                    System.out.print("\tTitle*: ");
                    title = input.nextLine().toUpperCase();
                } while (title.isEmpty());

                String priorityLevel;
                do {
                    System.out.print("\tPriority Level (High, Medium, Low)*: ");
                    priorityLevel = input.nextLine().toUpperCase();

                    if (!priorityLevel.equalsIgnoreCase("High") && !priorityLevel.equalsIgnoreCase("Medium") && !priorityLevel.equalsIgnoreCase("Low")) {
                        System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
                        priorityLevel = "";
                    }

                }while (priorityLevel.isEmpty());



                int dueDate, month, year;

                do {
                    System.out.print("\tDue Date (1-31)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 31.");
                        input.next();
                    }
                    dueDate = input.nextInt();
                    input.nextLine();

                    if (dueDate < 1 || dueDate > 31) {
                        System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (dueDate < 1 || dueDate > 31);

                do {
                    System.out.print("\tMonth (e.g 11)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 12.");
                        input.next();
                    }
                    month = input.nextInt();
                    input.nextLine();

                    if (month < 1 || month > 12) {
                        System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (month < 1 || month > 12);

                do {
                    System.out.print("\tYear (e.g 2024)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                        input.next();
                    }
                    year = input.nextInt();
                    input.nextLine();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (year < 1000 || year > 9999);



                System.out.print("\tShort Description: ");
                String description = input.nextLine();

                System.out.print("\tTopic: ");
                String topic = input.nextLine();


                System.out.print("\tLocation: ");
                String location = input.nextLine();


                System.out.print("\tExam Type (e.g. Quiz, Summative Exam, etc.): ");
                String type = input.nextLine();

                System.out.print("Do you want to save changes? (Yes/No): ");
                response = input.nextLine();

                if (response.equalsIgnoreCase("Yes")) {
                    Exam exam = new Exam(title, priorityLevel, dueDate, month, year, topic, description, subject, location, type);
                    subject.addTask(exam);

                    System.out.println("Task Saved!");
                    pressEnterToContinue();
                    loop = false;
                } else {
                    loop = true;
                }

            } while (loop);

        } else if (choice == 2) { //LAB
            System.out.println("== ADD LABORATORY ==");

            boolean repeat;

            do {
                repeat = false;

                input.nextLine();
                String title;
                do {
                    System.out.print("\tTitle*: ");
                    title = input.nextLine().toUpperCase();
                } while (title.isEmpty());

                String priorityLevel;
                do {
                    System.out.print("\tPriority Level (High, Medium, Low)*: ");
                    priorityLevel = input.nextLine().toUpperCase();

                    if (!priorityLevel.equalsIgnoreCase("High") && !priorityLevel.equalsIgnoreCase("Medium") && !priorityLevel.equalsIgnoreCase("Low")) {
                        System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
                        priorityLevel = "";
                    }

                }while (priorityLevel.isEmpty());



                int dueDate, month, year;

                do {
                    System.out.print("\tDue Date (1-31)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 31.");
                        input.next();
                    }
                    dueDate = input.nextInt();
                    input.nextLine();

                    if (dueDate < 1 || dueDate > 31) {
                        System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (dueDate < 1 || dueDate > 31);

                do {
                    System.out.print("\tMonth (e.g 11)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 12.");
                        input.next();
                    }
                    month = input.nextInt();
                    input.nextLine();

                    if (month < 1 || month > 12) {
                        System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (month < 1 || month > 12);

                do {
                    System.out.print("\tYear (e.g 2024)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                        input.next();
                    }
                    year = input.nextInt();
                    input.nextLine();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (year < 1000 || year > 9999);

                System.out.print("\tTopic: ");
                String topic = input.nextLine();

                System.out.print("\tShort Description: ");
                String description = input.nextLine();

                System.out.print("\tLocation: ");
                String location = input.nextLine();

                Laboratory lab = new Laboratory(title, priorityLevel, dueDate, month, year, topic, description, subject, location);

                System.out.print("Do you want to add materials? (yes/no): ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    boolean addMoreMaterials;
                    do {
                        System.out.print("\tMaterial Name: ");
                        String name = input.nextLine();

                        System.out.print("\tQuantity: ");
                        int quantity = input.nextInt();
                        input.nextLine();

                        Materials materials = new Materials(name, quantity);
                        lab.addEquipment(materials);

                        System.out.print("Do you want to add another material? (yes/no): ");
                        String moreMaterials = input.nextLine();
                        addMoreMaterials = moreMaterials.equalsIgnoreCase("yes");
                    } while (addMoreMaterials);
                }

                System.out.print("Do you want to save changes? (Yes/No): ");
                String ans = input.nextLine();

                if (ans.equalsIgnoreCase("Yes")) {
                    subject.addTask(lab);
                    System.out.println("Task Saved!");
                    pressEnterToContinue();
                } else {
                    System.out.println("Changes discarded. Please try again.");
                    repeat = true;
                }
            } while (repeat);




        } else if (choice == 3) { //GPROJECT
            System.out.println("== ADD GROUP PROJECT ==");

            boolean repeat;

            do {
                repeat = false;

                input.nextLine();
                String title;
                do {
                    System.out.print("\tTitle*: ");
                    title = input.nextLine().toUpperCase();
                } while (title.isEmpty());

                String priorityLevel;
                do {
                    System.out.print("\tPriority Level (High, Medium, Low)*: ");
                    priorityLevel = input.nextLine().toUpperCase();

                    if (!priorityLevel.equalsIgnoreCase("High") && !priorityLevel.equalsIgnoreCase("Medium") && !priorityLevel.equalsIgnoreCase("Low")) {
                        System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
                        priorityLevel = "";
                    }

                }while (priorityLevel.isEmpty());



                int dueDate, month, year;

                do {
                    System.out.print("\tDue Date (1-31)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 31.");
                        input.next();
                    }
                    dueDate = input.nextInt();
                    input.nextLine();

                    if (dueDate < 1 || dueDate > 31) {
                        System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (dueDate < 1 || dueDate > 31);

                do {
                    System.out.print("\tMonth (e.g 11)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 12.");
                        input.next();
                    }
                    month = input.nextInt();
                    input.nextLine();

                    if (month < 1 || month > 12) {
                        System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (month < 1 || month > 12);

                do {
                    System.out.print("\tYear (e.g 2024)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                        input.next();
                    }
                    year = input.nextInt();
                    input.nextLine();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (year < 1000 || year > 9999);

                System.out.print("\tTopic: ");
                String topic = input.nextLine();

                System.out.print("\tShort Description: ");
                String description = input.nextLine();

                GroupProject groupProject = new GroupProject(title, priorityLevel, dueDate, month, year, topic, description, subject);

                System.out.print("Do you want to add materials? (yes/no): ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    boolean addMoreMaterials;
                    do {
                        System.out.print("\tMaterial Name: ");
                        String name = input.nextLine();

                        System.out.print("\tQuantity: ");
                        int quantity = input.nextInt();
                        input.nextLine();

                        Materials materials = new Materials(name, quantity);
                        groupProject.addEquipment(materials);

                        System.out.print("Do you want to add another material? (yes/no): ");
                        String moreMaterials = input.nextLine();
                        addMoreMaterials = moreMaterials.equalsIgnoreCase("yes");
                    } while (addMoreMaterials);
                }

                System.out.print("Do you want to save changes? (Yes/No): ");
                String ans = input.nextLine();

                if (ans.equalsIgnoreCase("Yes")) {
                    subject.addTask(groupProject);
                    System.out.println("Task Saved!");
                    pressEnterToContinue();
                } else {
                    System.out.println("Changes discarded. Please try again.");
                    repeat = true;
                }
            } while (repeat);


        } else if (choice == 4) { //PRESENTTAIN
            boolean repeat;

            do {
                repeat = false;

                System.out.println("== ADD PRESENTATION ==");

                input.nextLine();
                String title;
                do {
                    System.out.print("\tTitle*: ");
                    title = input.nextLine().toUpperCase();
                } while (title.isEmpty());

                String priorityLevel;
                do {
                    System.out.print("\tPriority Level (High, Medium, Low)*: ");
                    priorityLevel = input.nextLine().toUpperCase();

                    if (!priorityLevel.equalsIgnoreCase("High") && !priorityLevel.equalsIgnoreCase("Medium") && !priorityLevel.equalsIgnoreCase("Low")) {
                        System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
                        priorityLevel = "";
                    }

                }while (priorityLevel.isEmpty());



                int dueDate, month, year;

                do {
                    System.out.print("\tDue Date (1-31)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 31.");
                        input.next();
                    }
                    dueDate = input.nextInt();
                    input.nextLine();

                    if (dueDate < 1 || dueDate > 31) {
                        System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (dueDate < 1 || dueDate > 31);

                do {
                    System.out.print("\tMonth (e.g 11)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 12.");
                        input.next();
                    }
                    month = input.nextInt();
                    input.nextLine();

                    if (month < 1 || month > 12) {
                        System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (month < 1 || month > 12);

                do {
                    System.out.print("\tYear (e.g 2024)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                        input.next();
                    }
                    year = input.nextInt();
                    input.nextLine();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (year < 1000 || year > 9999);

                System.out.print("\tTopic: ");
                String topic = input.nextLine();

                System.out.print("\tShort Description: ");
                String description = input.nextLine();

                System.out.print("\tMedium (e.g. PowerPoint, Canva, etc.): ");
                String medium = input.nextLine();

                System.out.print("Do you want to save changes? (Yes/No): ");
                String ans = input.nextLine();

                if (ans.equalsIgnoreCase("Yes")) {
                    Presentation presentation = new Presentation(title, priorityLevel, dueDate, month, year, topic, description, subject, medium);
                    subject.addTask(presentation);
                    System.out.println("Task Saved!");
                    pressEnterToContinue();
                } else {
                    System.out.println("Changes discarded. Please try again.");
                    repeat = true;
                }
            } while (repeat);


        } else if (choice == 5) { //ASSIGNMENT
            boolean repeat;

            do {
                repeat = false;

                System.out.println("== ADD ASSIGNMENT/Activity ==");

                input.nextLine();
                String title;
                do {
                    System.out.print("\tTitle*: ");
                    title = input.nextLine().toUpperCase();
                } while (title.isEmpty());

                String priorityLevel;
                do {
                    System.out.print("\tPriority Level (High, Medium, Low)*: ");
                    priorityLevel = input.nextLine().toUpperCase();

                    if (!priorityLevel.equalsIgnoreCase("High") && !priorityLevel.equalsIgnoreCase("Medium") && !priorityLevel.equalsIgnoreCase("Low")) {
                        System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
                        priorityLevel = "";
                    }

                }while (priorityLevel.isEmpty());



                int dueDate, month, year;

                do {
                    System.out.print("\tDue Date (1-31)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 31.");
                        input.next();
                    }
                    dueDate = input.nextInt();
                    input.nextLine();

                    if (dueDate < 1 || dueDate > 31) {
                        System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (dueDate < 1 || dueDate > 31);

                do {
                    System.out.print("\tMonth (e.g 11)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number between 1 and 12.");
                        input.next();
                    }
                    month = input.nextInt();
                    input.nextLine();

                    if (month < 1 || month > 12) {
                        System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (month < 1 || month > 12);

                do {
                    System.out.print("\tYear (e.g 2024)*: ");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                        input.next();
                    }
                    year = input.nextInt();
                    input.nextLine();

                    if (year < 1000 || year > 9999) {
                        System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                        pressEnterToContinue();
                    }
                } while (year < 1000 || year > 9999);

                System.out.print("\tTopic: ");
                String topic = input.nextLine();

                System.out.print("\tShort Description: ");
                String description = input.nextLine();

                System.out.print("\tFormat (e.g. Soft copy, Hard copy, etc.): ");
                String format = input.nextLine();

                System.out.print("\tType (e.g. Essay, Module, etc.): ");
                String type = input.nextLine();

                System.out.print("Do you want to save changes? (Yes/No): ");
                String ans = input.nextLine();

                if (ans.equalsIgnoreCase("Yes")) {
                    Assignment assignment = new Assignment(title, priorityLevel, dueDate, month, year, topic, description, subject, format, type);
                    subject.addTask(assignment);
                    System.out.println("Task Saved!");
                    pressEnterToContinue();
                } else {
                    System.out.println("Changes discarded. Please try again.");
                    repeat = true;
                }
            } while (repeat);

        } else {
            System.out.println("==> Assistant: Choose only from 1-5!");
            pressEnterToContinue();
        }
    }

    public static void updateTask(Subject subject) {
        Scanner input = new Scanner(System.in);
        LinkedList<Task> tasks = subject.getTasks();

        if (tasks.isEmpty()) {
            System.out.println("No tasks available to update in " + subject.getSubjectName() + ".");
            return;
        }

        // Display task titles
        System.out.println("\n== TASKS IN " + subject.getSubjectName() + " ==");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("\tTASK [" + (i + 1) + "] " + tasks.get(i).getTitle(i));
        }

        System.out.print("Select a task to update (1-" + tasks.size() + "): ");
        int taskIndex = input.nextInt() - 1;
        input.nextLine();

        if (taskIndex < 0 || taskIndex >= tasks.size()) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        Task taskToUpdate = tasks.get(taskIndex);
        line();
        System.out.println("\n== DETAILS OF SELECTED TASK ==");
        taskToUpdate.display();

        boolean continueUpdating = true;
        while (continueUpdating) {
            displayUpdateOptions(taskToUpdate);
            System.out.println("Choice: ");
            int updateChoice = input.nextInt();
            input.nextLine();
            continueUpdating = handleUpdateChoice(taskToUpdate, updateChoice, input);
        }
    }

    private static void displayUpdateOptions(Task task) {
        System.out.println("\nSelect an attribute to update:");
        System.out.println("\t[1] Title");
        System.out.println("\t[2] Priority Level");
        System.out.println("\t[3] Due Date");
        System.out.println("\t[4] Month");
        System.out.println("\t[5] Topic");
        System.out.println("\t[6] Short Description");

        if (task instanceof Exam) {
            System.out.println("\t[7] Location");
            System.out.println("\t[8] Exam Type");
        } else if (task instanceof Laboratory) {
            System.out.println("\t[7] Location");
            System.out.println("\t[8] Material Name");
            System.out.println("\t[9] Material Quantity");
        } else if (task instanceof GroupProject) {
            System.out.println("\t[7] Material Name");
            System.out.println("\t[8] Material Quantity");
        } else if (task instanceof Presentation) {
            System.out.println("\t[7] Medium");
        } else if (task instanceof Assignment) {
            System.out.println("\t[7] Format");
            System.out.println("\t[8] Type");
        }
        System.out.println("\t[0] Done Updating");
    }

    private static boolean handleUpdateChoice(Task task, int choice, Scanner input) {
        switch (choice) {
            case 1:
                updateTitle(task, input);
                break;
            case 2:
                updatePriorityLevel(task, input);
                break;
            case 3:
                updateDueDate(task, input);
                break;
            case 4:
                updateMonth(task, input);
                break;
            case 5:
                updateTopic(task, input);
                break;
            case 6:
                updateDescription(task, input);
                break;
            case 7:
                if (task instanceof Exam) {
                    updateLocation((Exam) task, input);
                } else if (task instanceof Laboratory) {
                    updateLocation((Laboratory) task, input);
                } else if (task instanceof GroupProject) {
                    updateMaterialNames((GroupProject) task, input);
                } else if (task instanceof Presentation) {
                    updateMedium((Presentation) task, input);
                } else if (task instanceof Assignment) {
                    updateFormat((Assignment) task, input);
                }
                break;
            case 8:
                if (task instanceof Exam) {
                    updateExamType((Exam) task, input);
                } else if (task instanceof Laboratory) {
                    updateMaterialNames((Laboratory) task, input);
                } else if (task instanceof GroupProject) {
                    updateMaterialQuantities((GroupProject) task, input);
                } else if (task instanceof Assignment) {
                    updateType((Assignment) task, input);
                }
                break;
            case 9:
                if (task instanceof Laboratory) {
                    updateMaterialQuantities((Laboratory) task, input);
                }
            case 0:
                System.out.println("Finished updating the task.");
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        return true;
    }

    private static void updateTitle(Task task, Scanner input) {
        System.out.print("New Title: ");
        String newTitle = input.nextLine();
        if (!newTitle.isEmpty()) {
            task.setTitle(newTitle);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updatePriorityLevel(Task task, Scanner input) {
        System.out.print("New Priority Level (High, Medium, Low): ");
        String newPriorityLevel = input.nextLine();
        if (!newPriorityLevel.isEmpty()) {
            task.setPriorityLevel(newPriorityLevel);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateDueDate(Task task, Scanner input) {
        System.out.print("New Due Date: ");
        String dueDateInput = input.nextLine();
        if (!dueDateInput.isEmpty()) {
            int newDueDate = Integer.parseInt(dueDateInput);
            task.setDueDate(newDueDate);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateMonth(Task task, Scanner input) {
        System.out.print("New Month: ");
        String monthInput = input.nextLine();
        if (!monthInput.isEmpty()) {
            int newMonth = Integer.parseInt(monthInput);
            task.setMonth(newMonth);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateTopic(Task task, Scanner input) {
        System.out.print("New Topic: ");
        String newTopic = input.nextLine();
        if (!newTopic.isEmpty()) {
            task.setTopic(newTopic);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateDescription(Task task, Scanner input) {
        System.out.print("New Short Description: ");
        String newDescription = input.nextLine();
        if (!newDescription.isEmpty()) {
            task.setDescription(newDescription);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateLocation(Exam task, Scanner input) {
        System.out.print("New Location: ");
        String newLocation = input.nextLine();
        if (!newLocation.isEmpty()) {
            task.setLocation(newLocation);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateLocation(Laboratory task, Scanner input) {
        System.out.print("New Location: ");
        String newLocation = input.nextLine();
        if (!newLocation.isEmpty()) {
            task.setLocation(newLocation);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateExamType(Exam task, Scanner input) {
        System.out.print("New Exam Type: ");
        String newExamType = input.nextLine();
        if (!newExamType.isEmpty()) {
            task.setExamType(newExamType);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateMaterialNames(Task task, Scanner input) {
        TreeMap<String, Materials> equipment = null;

        if (task instanceof Laboratory) {
            equipment = ((Laboratory) task).getEquipment();
        } else if (task instanceof GroupProject) {
            equipment = ((GroupProject) task).getEquipment();
        }

        // Check if there are any materials to update
        if (equipment == null || equipment.isEmpty()) {
            System.out.println("No materials found to update.");
            return;
        }

        // Display the current materials
        System.out.println("Current materials:");
        for (String materialName : equipment.keySet()) {
            System.out.println("- " + materialName);
        }

        // Ask the user which material they want to update
        System.out.print("Enter the name of the material you want to update: ");
        String materialToUpdate = input.nextLine();

        // Check if the specified material exists
        if (!equipment.containsKey(materialToUpdate)) {
            System.out.println("Material '" + materialToUpdate + "' not found.");
            return;
        }

        // Get the material to update
        Materials material = equipment.get(materialToUpdate);

        // Prompt for the new name
        System.out.print("Enter new name (or press Enter to keep it unchanged): ");
        String newName = input.nextLine();

        if (!newName.isEmpty()) {
            material.setMaterialName(newName);
            System.out.println("Material name has been updated to '" + newName + "'!");
        } else {
            System.out.println("Material name remains as '" + materialToUpdate + "'.");
        }
    }

    private static void updateMaterialQuantities(Task task, Scanner input) {
        TreeMap<String, Materials> equipment = null;

        if (task instanceof Laboratory) {
            equipment = ((Laboratory) task).getEquipment();
        } else if (task instanceof GroupProject) {
            equipment = ((GroupProject) task).getEquipment();
        }

        // Check if there are any materials to update
        if (equipment == null || equipment.isEmpty()) {
            System.out.println("No materials found to update.");
            return;
        }

        // Display the current materials and their quantities
        System.out.println("Current materials and their quantities:");
        for (Map.Entry<String, Materials> entry : equipment.entrySet()) {
            String materialName = entry.getKey();
            Materials material = entry.getValue();
            System.out.println("- " + materialName + ": " + material.getQuantity());
        }

        // Ask the user which material they want to update
        System.out.print("Enter the name of the material whose quantity you want to update: ");
        String materialToUpdate = input.nextLine();

        // Check if the specified material exists
        if (!equipment.containsKey(materialToUpdate)) {
            System.out.println("Material '" + materialToUpdate + "' not found.");
            return;
        }

        // Get the material to update
        Materials material = equipment.get(materialToUpdate);

        // Loop until a valid quantity is entered or the user decides to keep the current quantity
        while (true) {
            System.out.print("Enter new quantity (or press Enter to keep it unchanged): ");
            String quantityInput = input.nextLine();

            if (quantityInput.isEmpty()) {
                System.out.println("Material quantity remains as " + material.getQuantity() + ".");
                return; // Exit the loop if the user wants to keep the current quantity
            }

            try {
                int newQuantity = Integer.parseInt(quantityInput);
                material.setQuantity(newQuantity);
                System.out.println("Material quantity has been updated to " + newQuantity + "!");
                return; // Exit the loop after a successful update
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for quantity. Please enter a valid number.");
                // The loop will continue, prompting the user again
            }
        }
    }

    private static void updateMedium(Presentation task, Scanner input) {
        System.out.print("New Medium: ");
        String newMedium = input.nextLine();
        if (!newMedium.isEmpty()) {
            task.setMedium(newMedium);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateFormat(Assignment task, Scanner input) {
        System.out.print("New Format: ");
        String newFormat = input.nextLine();
        if (!newFormat.isEmpty()) {
            task.setSubmissionFormat(newFormat);
            System.out.print("Task has been updated! ");
        }
    }

    private static void updateType(Assignment task, Scanner input) {
        System.out.print("New Type: ");
        String newType = input.nextLine();
        if (!newType.isEmpty()) {
            task.setType(newType);
            System.out.print("Task has been updated! ");
        }
    }


    // log out and return to registration
    public static void logOut() {
        System.out.println("LOG-OUT");
        register();
    }
    //Display Methods

    public static void display(Subject subject) {
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

    public static void line() {
        for (int i = 0; i < 35; i++) {
            System.out.print("==");
        }
    }

    public static void thinLine() {
        for (int i = 0; i < 35; i++) {
            System.out.print("--");
        }
    }

    public static void clear(){
        for (int i = 0;i < 35 ;i++){
            System.out.println(" ");
        }
    }

}