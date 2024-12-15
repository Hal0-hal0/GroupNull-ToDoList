package finalproject;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    private static Student registeredStudent;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student = new Student("Geneveb","Abadoya","2024M0482","Zone 2, Bo. Obrero, Iloilo City",2,'A',"BSIT");

        Subject oop = new Subject("Object-Oriented Programming", "Harder Keia Joy", "CIT 207", 5, 2, "Computer Programming", "College of Information Communication Technology", "Major");
        Subject dataStructures = new Subject("Data Structures And Algorithm", "Harder Keia Joy", "CC 204", 20, 2, "Computer Programming", "College of Information Communication Technology", "Major");
        Subject art = new Subject("Art Appreciation", "Souribio Arturo", "HUM 110", 20, 2, "Education", "College of Education", "Minor");
        Subject contemporary = new Subject("Contemporary World", "Beleno Ramon B.", "SS 111", 20, 2, "Political Science", "College of Arts and Sciences", "Minor");
        Subject ethics = new Subject("Ethics", "Tusiap Andrea L.", "SS 112", 3, 11, "Political Science", "College of Arts and Sciences", "Minor");
        Subject platTech = new Subject("Platform Technologies", "Cadiz Christian", "CIT 206", 3, 1, "Computer Programming", "College of Information Communication Technology", "Major");
        Subject pathfit = new Subject("PATHFIT 3", "Daanoy Christine Joy F", "PATHFIT 3", 3, 1, "Education", "College of Pescar", "Minor");
        Subject hci = new Subject("Human-Computer Interaction 1", "Payunan Ryan Christian", "CIT 205", 3, 1, "Computer Programming", "College of Information Communication Technology", "Major");

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
        System.out.println("                                ASAP!");
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
                int transaction = 0;
                System.out.println("== MENU ==");
                System.out.println("Let's organize things up!");
                System.out.println("\t[1] Add Task \n\t[2] Delete and Mark as Done\n\t[3] Edit/Update \n\t[4] Display\n\t[5] Exit");
                System.out.print("Choose a transaction (Type 1): ");
                transaction = input.nextInt();

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
                        System.out.println("==> Gebinib: Choose only from 1-8!");
                        pressEnterToContinue();
                        clear();
                    }

                } else if (transaction == 2) {
                    boolean loop;
                    do {
                        loop = true;
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
                            oop.displayTasks();
                        } else if (choice == 2) {
                            System.out.println("==> DATA STRUCTURES AND ALGORITHM");
                            dataStructures.displayTasks();
                        } else if (choice == 3) {
                            System.out.println("==> ART APPRECIATION");
                            art.displayTasks();
                        } else if (choice == 4) {
                            System.out.println("==> CONTEMPORARY WORLD");
                            contemporary.displayTasks();
                        } else if (choice == 5) {
                            System.out.println("==> ETHICS");
                            ethics.displayTasks();
                        } else if (choice == 6) {
                            System.out.println("==> PLATFORM TECHNOLOGIES");
                            platTech.displayTasks();
                        } else if (choice == 7) {
                            System.out.println("==> PATHFIT");
                            pathfit.displayTasks();
                        } else if (choice == 8) {
                            System.out.println("==> HUMAN COMPUTER INTERACTION");
                            hci.displayTasks();
                        } else if (choice == 0) {
                            System.out.println("Transaction cancelled!");
                            loop = false;
                        } else {
                            System.out.println("=> Gebinib: Choose only from 1-8!");
                        }
                        pressEnterToContinue();
                    } while (loop);

                } else if (transaction == 3) {
                    boolean loop;
                    do {
                        loop = true;

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
                            System.out.println("\n=ADD ART APPRECIATION=");
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
                            System.out.println("\n==> SUBJECT: ADD PATHFIT");
                            updateTask(pathfit);
                        } else if (choice == 8) {
                            System.out.println("\n\n");
                            line();
                            System.out.println("\n==> SUBJECT: ADD HUMAN COMPUTER INTERACTION=");
                            updateTask(hci);
                        } else if (choice == 0) {
                            System.out.println("Transaction cancelled!");
                            loop = false;
                        } else {
                            System.out.println("Invalid input!");
                        }
                        pressEnterToContinue();
                    } while (loop);



                } else if (transaction == 4) {



                    boolean loop;
                    do {
                        loop = true;

                        line();

                        System.out.println("\n                          ==> DISPLAY <==");
                        System.out.println("Instruction: Choose a subject that you want to DISPLAY");
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
                        System.out.println("\t[9] Display Student and Subject Details");
                        thinLine();

                        System.out.print("\nSubject: ");
                        int choice = input.nextInt();

                        line();
                        System.out.println("\n== DISPLAY TASK ==");
                        if (choice == 1) {
                            System.out.println("==> DISPLAY OBJECT ORIENTED PROGRAMMING");
                            oop.displaySortedTasks();
                        } else if (choice == 2) {
                            System.out.println("==> DISPLAY DATA STRUCTURES");
                            dataStructures.displaySortedTasks();

                        } else if (choice == 3) {
                            System.out.println("==> DISPLAY ART APPRECIATION");
                            art.displaySortedTasks();

                        } else if (choice == 4) {
                            System.out.println("==> DISPLAY CONTEMPORARY WORLD");
                            contemporary.displaySortedTasks();

                        } else if (choice == 5) {
                            System.out.println("==> DISPLAY ETHICS");
                            ethics.displaySortedTasks();

                        } else if (choice == 6) {
                            System.out.println("==> DISPLAY PLATFORM TECHNOLOGIES");
                            platTech.displaySortedTasks();

                        } else if (choice == 7) {
                            System.out.println("==> DISPLAY PATHFIT");
                            pathfit.displaySortedTasks();

                        } else if (choice == 8) {
                            System.out.println("==> DISPLAY HUMAN COMPUTER INTERACTION");
                            hci.displaySortedTasks();

                        } else if (choice == 9) {
                            registeredStudent.displayAllStudent();
                            displaySubjectsForRegisteredStudent();
//                            if (registeredStudent.){
//                                System.out.println("No student registered!");
//                            } else {
//                                registeredStudent.displayAllStudent();
//                                displaySubjectsForRegisteredStudent();
//                            }
                        } else if (choice == 0) {
                            System.out.println("Transaction cancelled!");
                            loop = false;
                        } else {
                            System.out.println("=> Gebinib: Choose only from 1-8!");
                        }

                        pressEnterToContinue();
                    } while (loop);


                } else if (transaction == 5) {
                    input.nextLine();
                    System.out.print("=> Gebinib: Are you sure you want to exit the app?\nThis will discard all changes in the app! (Yes/No): ");
                    String answer = input.nextLine();

                    if (answer.equalsIgnoreCase("Yes")) {
                        System.out.println("Exiting the app...");
                        break;
                    } else {
                        System.out.println("Returning to menu!");
                        pressEnterToContinue();
                    }
                } else {
                    System.out.println("\n==> Gebinib: Please choose only from 1-5!");
                    pressEnterToContinue();
                }
            } catch (Exception e) {
                System.out.println("\n==> Gebinib: Invalid Input!");
                input.nextLine();
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
            System.out.println("==> Gebinib: Let's register you first!");

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
                System.out.print("\tAddress (Street/Barangay, Municipality/ City)*: ");
                address = input.nextLine().toUpperCase();

            } while (address.isEmpty());


            char section = 'A';

            do {
                System.out.print("\tSection (ex. A)*: ");
                section = input.next().toUpperCase().charAt(0);

                if (section == 'A') {
                    isValid = false;
                    input.nextLine();
                } else {
                    System.out.println("==> Gebinib: Invalid input!");
                    isValid = true;
                }
            } while (isValid);

            String program;
            do {
                System.out.print("\tProgram (ex. BSIT)*: ");
                program = input.nextLine().toUpperCase();

                if (!program.equalsIgnoreCase("BSIT")){
                    System.out.println("==> Gebinib: Invalid program!");
                    program = "";
                }
            } while (program.isEmpty());


            String ans;
            do {
                System.out.print("=> Gebinib: Do you want to SAVE this information?(Yes/No): ");
                ans = input.nextLine();

                if (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")){
                    ans = "";
                }
            } while (ans.isEmpty());


            if (ans.equalsIgnoreCase("yes")) {
                line();
                System.out.println("\n=> Gebinib: Welcome, " + firstName + "!");
                pressEnterToContinue();
                line();

                // Add student
                Student student = new Student(firstName, lastName, id, address, 2, section, program);
                //Student.addStudent(student);
                student.addStudent(student);
                registeredStudent = student;

                //Create subject
                Subject oop = new Subject("Object-Oriented Programming", "Harder Keia Joy", "CIT 207", 5, 2, "Computer Programming", "College of Information Communication Technology", "Major");
                Subject dataStructures = new Subject("Data Structures And Algorithm", "Harder Keia Joy", "CC 204", 20, 2, "Computer Programming", "College of Information Communication Technology", "Major");
                Subject art = new Subject("Art Appreciation", "Souribio Arturo", "HUM 110", 20, 2, "Education", "College of Education", "Minor");
                Subject contemporary = new Subject("Contemporary World", "Beleno Ramon B.", "SS 111", 20, 2, "Political Science", "College of Arts and Sciences", "Minor");
                Subject ethics = new Subject("Ethics", "Tusiap Andrea L.", "SS 112", 3, 11, "Political Science", "College of Arts and Sciences", "Minor");
                Subject platTech = new Subject("Platform Technologies", "Cadiz Christian", "CIT 206", 3, 1, "Computer Programming", "College of Information Communication Technology", "Major");
                Subject pathfit = new Subject("PATHFIT 3", "Daanoy Christine Joy F", "PATHFIT 3", 3, 1, "Education", "College of Pescar", "Minor");
                Subject hci = new Subject("Human-Computer Interaction 1", "Payunan Ryan Christian", "CIT 205", 3, 1, "Computer Programming", "College of Information Communication Technology", "Major");

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

        do {
            loop = true;
            line();
            System.out.println("\nChoose a Task Type:");
            System.out.println("\t[1] Exam \n\t[2] Laboratory \n\t[3] Project \n\t[4] Presentation \n\t[5] Assignment \n\t[0] Cancel");
            line();
            System.out.print("\nTask (e.g. 1): ");
            int choice = input.nextInt();

            if (choice == 1) { //EXAM
                boolean repeat;
                do {
                    repeat = false;
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

                    do {
                        System.out.print("Do you want to save changes? (Yes/No): ");
                        response = input.nextLine();

                        if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
                            response = "";
                        }
                    } while (response.isEmpty());


                    if (response.equalsIgnoreCase("Yes")) {
                        Exam exam = new Exam(title, priorityLevel, dueDate, month, year, topic, description, subject, location, type);
                        subject.addTask(exam);

                        System.out.println("Task Saved!");
                        pressEnterToContinue();
                        loop = true;
                    } else {
                        System.out.println("==> Gebinib: Changes discarded. Please try again.");
                        repeat = false;
                    }

                } while (repeat);

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


                    String answer;
                    do {
                        loop = true;
                        System.out.print("Do you want to ADD MATERIALS? (yes/no): ");
                        answer = input.nextLine();

                        if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                            System.out.println("==> Gebinib: Invalid Input!");
                            loop = true;
                            pressEnterToContinue();
                        } else {
                            loop = false;
                        }
                    } while (loop);


                    if (answer.equalsIgnoreCase("yes")) {
                        boolean addMoreMaterials;
                        do {
                            addMoreMaterials = true;
                            System.out.print("\tMaterial Name: ");
                            String name = input.nextLine();

                            System.out.print("\tQuantity: ");
                            int quantity = input.nextInt();
                            input.nextLine();

                            Materials materials = new Materials(name, quantity);
                            lab.addEquipment(materials);

                            String moreMaterials;
                            do {
                                loop = true;
                                System.out.print("Do you want to add another material? (yes/no): ");
                                moreMaterials = input.nextLine();

                                if (!moreMaterials.equalsIgnoreCase("yes") && !moreMaterials.equalsIgnoreCase("no")){
                                    System.out.println("==> Gebinib: Invalid Input!");
                                    loop = true;
                                    pressEnterToContinue();
                                } else {
                                    addMoreMaterials = moreMaterials.equalsIgnoreCase("yes");
                                    loop = false;
                                }
                            } while (loop);
                        } while (addMoreMaterials);
                    }

                    String ans;

                    do {
                        System.out.print("Do you want to save changes? (Yes/No): ");
                        ans = input.nextLine();

                        if (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")){
                            ans = "";
                        }
                    } while (ans.isEmpty());

                    if (ans.equalsIgnoreCase("Yes")) {
                        subject.addTask(lab);
                        System.out.println("Task Saved!");
                        pressEnterToContinue();
                        loop = true;
                    } else {
                        System.out.println("==> Gebinib: Changes discarded. Please try again.");
                        pressEnterToContinue();
                        repeat = false;

                    }
                } while (repeat);

            } else if (choice == 3) { //GPROJECT
                System.out.println("== ADD PROJECT ==");

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

                    Project project = new Project(title, priorityLevel, dueDate, month, year, topic, description, subject);

                    String answer;
                    do {
                        loop = true;
                        System.out.print("Do you want to ADD MATERIALS? (yes/no): ");
                        answer = input.nextLine();

                        if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                            System.out.println("==> Gebinib: Invalid Input!");
                            loop = true;
                            pressEnterToContinue();
                        } else {
                            loop = false;
                        }
                    } while (loop);

                    if (answer.equalsIgnoreCase("yes")) {
                        boolean addMoreMaterials;
                        do {
                            addMoreMaterials = true;
                            System.out.print("\tMaterial Name: ");
                            String name = input.nextLine();

                            System.out.print("\tQuantity: ");
                            int quantity = input.nextInt();
                            input.nextLine();

                            Materials materials = new Materials(name, quantity);
                            project.addEquipment(materials);

                            String moreMaterials;
                            do {
                                loop = true;
                                System.out.print("Do you want to add another material? (yes/no): ");
                                moreMaterials = input.nextLine();

                                if (!moreMaterials.equalsIgnoreCase("yes") && !moreMaterials.equalsIgnoreCase("no")){
                                    System.out.println("==> Gebinib: Invalid Input!");
                                    loop = true;
                                    pressEnterToContinue();
                                } else {
                                    addMoreMaterials = moreMaterials.equalsIgnoreCase("yes");
                                    loop = false;
                                }
                            } while (loop);
                        } while (addMoreMaterials);
                    }

                    String ans;

                    do {
                        System.out.print("Do you want to save changes? (Yes/No): ");
                        ans = input.nextLine();

                        if (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")){
                            ans = "";
                        }
                    } while (ans.isEmpty());

                    if (ans.equalsIgnoreCase("Yes")) {
                        subject.addTask(project);
                        System.out.println("Task Saved!");
                        pressEnterToContinue();
                        loop = true;
                    } else {
                        System.out.println("==> Gebinib: Changes discarded. Please try again.");
                        pressEnterToContinue();
                        repeat = false;
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

                    String ans;

                    do {
                        System.out.print("Do you want to save changes? (Yes/No): ");
                        ans = input.nextLine();

                        if (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")){
                            ans = "";
                        }
                    } while (ans.isEmpty());

                    if (ans.equalsIgnoreCase("Yes")) {
                        Presentation presentation = new Presentation(title, priorityLevel, dueDate, month, year, topic, description, subject, medium);
                        subject.addTask(presentation);
                        System.out.println("Task Saved!");
                        pressEnterToContinue();
                        loop = true;
                    } else {
                        System.out.println("==> Gebinib: Changes discarded. Please try again.");
                        pressEnterToContinue();
                        repeat = false;
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
                    boolean addDateAgain;

                    do {
                        addDateAgain = false;
                        System.out.print("\tDue Date (1-31)*: ");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid input. Please enter a number between 1 and 31.");
                            input.nextLine();
                            addDateAgain = true;
                        }

                        dueDate = input.nextInt();
                        input.nextLine();

                        if (dueDate < 1 || dueDate > 31) {
                            System.out.println("Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                            pressEnterToContinue();
                            addDateAgain = true;
                        }
                    } while (addDateAgain);

                    do {
                        addDateAgain = false;
                        System.out.print("\tMonth (e.g 11)*: ");
                        while (!input.hasNextInt()) {
                            System.out.println("Invalid input. Please enter a number between 1 and 12.");
                            input.nextLine();
                            addDateAgain = true;
                        }
                        month = input.nextInt();
                        input.nextLine();


                        if (month < 1 || month > 12) {
                            System.out.println("Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                            pressEnterToContinue();
                            addDateAgain = true;
                        }
                    } while (addDateAgain);

                    do {
                        addDateAgain = false;
                        System.out.print("\tYear (e.g 2024)*: ");
                        while (!input.hasNextInt()) {
                            System.out.println("Invalid input. Please enter a valid year (e.g., 2024).");
                            input.nextLine();
                            addDateAgain = true;
                        }
                        year = input.nextInt();
                        input.nextLine();

                        if (year < 1000 || year > 9999) {
                            System.out.println("Hmm... " + year + " seems invalid. Let's try again!");
                            pressEnterToContinue();
                            addDateAgain = true;
                        }
                    } while (addDateAgain);

                    System.out.print("\tTopic: ");
                    String topic = input.nextLine();

                    System.out.print("\tShort Description: ");
                    String description = input.nextLine();

                    System.out.print("\tFormat (e.g. Soft copy, Hard copy, etc.): ");
                    String format = input.nextLine();

                    System.out.print("\tType (e.g. Essay, Module, etc.): ");
                    String type = input.nextLine();

                    String ans;

                    do {
                        System.out.print("Do you want to save changes? (Yes/No): ");
                        ans = input.nextLine();

                        if (!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no")){
                            ans = "";
                        }
                    } while (ans.isEmpty());

                    if (ans.equalsIgnoreCase("Yes")) {
                        Assignment assignment = new Assignment(title, priorityLevel, dueDate, month, year, topic, description, subject, format, type);
                        subject.addTask(assignment);
                        System.out.println("Task Saved!");
                        pressEnterToContinue();
                    } else {
                        System.out.println("==> Gebinib: Changes discarded. Please try again.");
                        pressEnterToContinue();
                        repeat = false;
                    }
                } while (repeat);
            } else if (choice == 0) {
                System.out.println("Transaction Cancelled!");
                pressEnterToContinue();
                loop = false;
            } else {
                System.out.println("==> Gebinib: Choose only from 1-5!");
                pressEnterToContinue();
                loop = true;
            }
        } while (loop);


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
            System.out.println("\t==> TASK [" + (i + 1) + "] " + tasks.get(i).getTitle(i));
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
            System.out.print("Choice: ");
            int updateChoice = input.nextInt();
            input.nextLine();
            continueUpdating = handleUpdateChoice(taskToUpdate, updateChoice, input);
        }
    }

    private static void displayUpdateOptions(Task task) {
        thinLine();
        System.out.println("\nSelect an attribute to update:");
        System.out.println("\t[1] Title");
        System.out.println("\t[2] Priority Level");
        System.out.println("\t[3] Due Date");
        System.out.println("\t[4] Month");
        System.out.println("\t[5] Year");
        System.out.println("\t[6] Topic");
        System.out.println("\t[7] Short Description");

        if (task instanceof Exam) {
            System.out.println("\t[8] Location");
            System.out.println("\t[9] Exam Type");
        } else if (task instanceof Laboratory) {
            System.out.println("\t[8] Location");
            System.out.println("\t[9] Material Name");
            System.out.println("\t[10] Material Quantity");
        } else if (task instanceof Project) {
            System.out.println("\t[8] Material Name");
            System.out.println("\t[9] Material Quantity");
        } else if (task instanceof Presentation) {
            System.out.println("\t[8] Medium");
        } else if (task instanceof Assignment) {
            System.out.println("\t[8] Format");
            System.out.println("\t[9] Type");
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
                updateYear(task,input);
                break;
            case 6:
                updateTopic(task, input);
                break;
            case 7:
                updateDescription(task, input);
                break;
            case 8:
                if (task instanceof Exam) {
                    updateLocation((Exam) task, input);
                } else if (task instanceof Laboratory) {
                    updateLocation((Laboratory) task, input);
                } else if (task instanceof Project) {
                    updateMaterialNames((Project) task, input);
                } else if (task instanceof Presentation) {
                    updateMedium((Presentation) task, input);
                } else if (task instanceof Assignment) {
                    updateFormat((Assignment) task, input);
                }
                break;
            case 9:
                if (task instanceof Exam) {
                    updateExamType((Exam) task, input);
                } else if (task instanceof Laboratory) {
                    updateMaterialNames((Laboratory) task, input);
                } else if (task instanceof Project) {
                    updateMaterialQuantities((Project) task, input);
                } else if (task instanceof Assignment) {
                    updateType((Assignment) task, input);
                }
                break;
            case 10:
                if (task instanceof Laboratory) {
                    updateMaterialQuantities((Laboratory) task, input);
                }
                break;
            case 0:
                System.out.println("=> Gebinib: Finished updating the task.");
                return false;
            default:
                System.out.println("=> Gebinib: Invalid choice. Please try again.");
                break;
        }
        return true;
    }

    private static void updateTitle(Task task, Scanner input) {
        System.out.print("New Title: ");
        String newTitle = input.nextLine();
        if (!newTitle.isEmpty()) {
            task.setTitle(newTitle);
            System.out.println("=> Gebinib: Title has been updated to " + newTitle + "!");
        }
    }

    private static void updatePriorityLevel(Task task, Scanner input) {
        String priorityLevel;

        do {
            System.out.print("Priority Level (High, Medium, Low): ");
            priorityLevel = input.nextLine().trim(); // Trim whitespace

            // Check if the input is valid
            if (!priorityLevel.equalsIgnoreCase("High") &&
                    !priorityLevel.equalsIgnoreCase("Medium") &&
                    !priorityLevel.equalsIgnoreCase("Low")) {
                System.out.println("=> Gebinib: Invalid priority level. Please enter High, Medium, or Low.");
                priorityLevel = ""; // Reset to empty to continue the loop
            }
        } while (priorityLevel.isEmpty());

        // Update the priority level in the Task object
        task.setPriorityLevel(priorityLevel); // Assuming Task has a setPriorityLevel method
        System.out.println("=> Gebinib: Priority Level has been updated to " + priorityLevel + "!");
    }

    private static void updateDueDate(Task task, Scanner input) {
        int dueDate;

        do {
            System.out.print("\tDue Date (1-31)*: ");
            while (!input.hasNextInt()) {
                System.out.println("=> Gebinib: Invalid input. Please enter a number between 1 and 31.");
                input.next();
            }
            dueDate = input.nextInt();
            input.nextLine();

            if (dueDate < 1 || dueDate > 31) {
                System.out.println("=> Gebinib: Hmm... it seems like there is no " + dueDate + " in the calendar. Let's try again!");
                pressEnterToContinue();
            }
        } while (dueDate < 1 || dueDate > 31);
        task.setDueDate(dueDate);
        System.out.println("=> Gebinib: Due Date has been updated to " + dueDate + "!");


    }

    private static void updateMonth(Task task, Scanner input) {
        int month;
        do {
            System.out.print("\tMonth (e.g 11)*: ");
            while (!input.hasNextInt()) {
                System.out.println("=> Gebinib: Invalid input. Please enter a number between 1 and 12.");
                input.next();
            }
            month = input.nextInt();
            input.nextLine();

            if (month < 1 || month > 12) {
                System.out.println("=> Gebinib: Hmm... it seems like there is no " + month + " in the calendar. Let's try again!");
                pressEnterToContinue();
            }
        } while (month < 1 || month > 12);
        task.setMonth(month);
        System.out.println("=> Gebinib: Due Month has been updated to " + month + "!");

    }

    private static void updateYear(Task task, Scanner input) {
        int year;
        do {
            System.out.print("\tYear (e.g 2024)*: ");
            while (!input.hasNextInt()) {
                System.out.println("=> Gebinib: Invalid input. Please enter a valid year (e.g., 2024).");
                input.next();
            }
            year = input.nextInt();
            input.nextLine();

            if (year < 1000 || year > 9999) {
                System.out.println("=> Gebinib: Hmm... " + year + " seems invalid. Let's try again!");
                pressEnterToContinue();
            }
        } while (year < 1000 || year > 9999);
        task.setYear(year);
        System.out.println("=> Gebinib: Due Year has been updated to " + year + "!");

    }

    private static void updateTopic(Task task, Scanner input) {
        System.out.print("New Topic: ");
        String newTopic = input.nextLine();
        if (!newTopic.isEmpty()) {
            task.setTopic(newTopic);
            System.out.println("=> Gebinib: Topic has been updated to " + newTopic + "!");
        }
    }

    private static void updateDescription(Task task, Scanner input) {
        System.out.print("New Short Description: ");
        String newDescription = input.nextLine();
        if (!newDescription.isEmpty()) {
            task.setDescription(newDescription);
            System.out.println("=> Gebinib: Description has been updated to " + newDescription + "!");
        }
    }

    private static void updateLocation(Exam task, Scanner input) {
        System.out.print("New Location: ");
        String newLocation = input.nextLine();
        if (!newLocation.isEmpty()) {
            task.setLocation(newLocation);
            System.out.println("=> Gebinib: Exam Location has been updated to " + newLocation + "!");
        }
    }

    private static void updateLocation(Laboratory task, Scanner input) {
        System.out.print("New Location: ");
        String newLocation = input.nextLine();
        if (!newLocation.isEmpty()) {
            task.setLocation(newLocation);
            System.out.println("=> Gebinib: Laboratory Location has been updated to " + newLocation + "!");
        }
    }

    private static void updateExamType(Exam task, Scanner input) {
        System.out.print("New Exam Type: ");
        String newExamType = input.nextLine();
        if (!newExamType.isEmpty()) {
            task.setExamType(newExamType);
            System.out.println("=> Gebinib: Exam Type has been updated to " + newExamType + "!");
        }
    }

    private static void updateMaterialNames(Task task, Scanner input) {
        TreeMap<String, Materials> equipment = null;

        if (task instanceof Laboratory) {
            equipment = ((Laboratory) task).getEquipment();
        } else if (task instanceof Project) {
            equipment = ((Project) task).getEquipment();
        }

        // Check if there are any materials to update
        while (equipment == null || equipment.isEmpty()) {
            System.out.print("=> Gebinib: No materials found. Do you want to add a new material? (yes/no) ");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                do {
                    String materialName;
                    System.out.print("\tEnter the name of the new material (or type 'none' to cancel): ");
                    materialName = input.nextLine().trim();

                    if (materialName.isEmpty() || materialName.equalsIgnoreCase("none")) {
                        System.out.println("=> Gebinib: Exiting material addition.");
                        return; // Exit the method if the user does not want to add a material
                    }

                    System.out.print("\tEnter the quantity of the new material: ");
                    int quantity = input.nextInt();
                    input.nextLine(); // Consume the newline character

                    if (quantity > 0) {
                        // Create a new Materials object
                        Materials newMaterial = new Materials(materialName, quantity);
                        equipment.put(materialName, newMaterial); // Add the new material to the equipment map
                        System.out.println("=> Gebinib: Material '" + materialName + "' has been added with quantity " + quantity + "!");

                        // Ask if the user wants to add another material
                        System.out.print("=> Gebinib: Do you want to add another material? (yes/no) ");
                        String addMore = input.nextLine();
                        if (!addMore.equalsIgnoreCase("yes") && !addMore.equalsIgnoreCase("y")) {
                            System.out.println("=> Gebinib: Exiting material addition.");
                            return; // Exit if the user does not want to add more materials
                        }
                    } else {
                        System.out.println("=> Gebinib: Quantity must be greater than zero.");
                    }
                } while (true); // Continue prompting until the user decides to stop
            } else {
                System.out.println("=> Gebinib: Exiting material addition.");
                return; // Exit the method if the user does not want to add a material
            }
        }

        // Display the current materials
        System.out.println("Current materials:");
        for (String materialName : equipment.keySet()) {
            System.out.println("- " + materialName);
        }

        // Ask the user which material they want to update
        System.out.print("\tEnter the name of the material you want to update: ");
        String materialToUpdate = input.nextLine();

        // Check if the specified material exists
        if (!equipment.containsKey(materialToUpdate)) {
            System.out.println("=> Gebinib: Material '" + materialToUpdate + "' not found.");
            return;
        }

        // Get the material to update
        Materials material = equipment.get(materialToUpdate);

        // Prompt for the new name
        System.out.print("\tEnter new name (or press Enter to keep it unchanged): ");
        String newName = input.nextLine();

        if (!newName.isEmpty()) {
            // Update the material name in the map
            equipment.remove(materialToUpdate);
            material.setMaterialName(newName);
            equipment.put(newName, material);
            System.out.println("=> Gebinib: Material name has been updated to '" + newName + "'!");
        } else {
            System.out.println("=> Gebinib: Material name remains as '" + materialToUpdate + "'.");
        }
    }

    private static void updateMaterialQuantities(Task task, Scanner input) {
        TreeMap<String, Materials> equipment = null;

        if (task instanceof Laboratory) {
            equipment = ((Laboratory) task).getEquipment();
        } else if (task instanceof Project) {
            equipment = ((Project) task).getEquipment();
        }

        // Check if there are any materials to update
        if (equipment == null || equipment.isEmpty()) {
            System.out.println("=> Gebinib: No materials found to update.");
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
        System.out.print("\tEnter the name of the material whose quantity you want to update: ");
        String materialToUpdate = input.nextLine();

        // Check if the specified material exists
        if (!equipment.containsKey(materialToUpdate)) {
            System.out.println("=> Gebinib: Material '" + materialToUpdate + "' not found.");
            return;
        }

        // Get the material to update
        Materials material = equipment.get(materialToUpdate);

        // Loop until a valid quantity is entered or the user decides to keep the current quantity

        System.out.print("\tEnter new quantity (or press Enter to keep it unchanged): ");
        String quantityInput = input.nextLine();

        if (quantityInput.isEmpty()) {
            System.out.println("=> Gebinib: Material quantity remains as " + material.getQuantity() + ".");
            return; // Exit the loop if the user wants to keep the current quantity
        }

        try {
            int newQuantity = Integer.parseInt(quantityInput);
            material.setQuantity(newQuantity);
            System.out.println("=> Gebinib: Material quantity has been updated to " + newQuantity + "!");
            return; // Exit the loop after a successful update
        } catch (NumberFormatException e) {
            System.out.println("=> Gebinib: Invalid input for quantity. Please enter a valid number.");
            // The loop will continue, prompting the user again
        }

    }

    private static void updateMedium(Presentation task, Scanner input) {
        System.out.print("New Medium: ");
        String newMedium = input.nextLine();
        if (!newMedium.isEmpty()) {
            task.setMedium(newMedium);
            System.out.println("=> Gebinib: Presentation Medium has been updated to " + newMedium + "!");
        }
    }

    private static void updateFormat(Assignment task, Scanner input) {
        System.out.print("New Format: ");
        String newFormat = input.nextLine();
        if (!newFormat.isEmpty()) {
            task.setSubmissionFormat(newFormat);
            System.out.println("=> Gebinib: Assignment Format has been updated to " + newFormat + "!");
        }
    }

    private static void updateType(Assignment task, Scanner input) {
        System.out.print("New Type: ");
        String newType = input.nextLine();
        if (!newType.isEmpty()) {
            task.setType(newType);
            System.out.println("=> Gebinib: Assignment Type has been updated to " + newType + "!");
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

    public static void displaySubjectsForRegisteredStudent() {
        if (registeredStudent != null) {
            System.out.println("\n=> Registered Student's Subjects:");
            registeredStudent.displaySubject();
        } else {
            System.out.println("No student is registered yet.");
        }
    }

}