package finalproject;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Task {
    private String title;
    private String priorityLevel;
    private int dueDate;
    private int month;
    private int year;
    private String topic;
    private String description;
    private Subject subject;

//    public Task(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject) {
//        this.title = title;
//        this.priorityLevel = priorityLevel;
//        this.dueDate = dueDate;
//        this.month = month;
//        this.topic = topic;
//        this.description = description;
//        this.subject = subject;
//    }

    public Task(String title, String priorityLevel, int dueDate, int month, int year, String topic, String description, Subject subject) {
        this.title = title;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.month = month;
        this.year = year;
        this.topic = topic;
        this.description = description;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle(int i) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // ================== get Remaining days =====================

    public void deadlineTracker(int date, int month, int year){

        LocalDate deadline = LocalDate.of(year,month,date);
        LocalDate currentDate = LocalDate.now();

        long daysLeft = ChronoUnit.DAYS.between(currentDate,deadline);

        if (daysLeft > 0) {
            System.out.println("\tYour DEADLINE is in " + daysLeft + " day(s).");
        } else if (daysLeft == 0) {
            System.out.println("\tYour DEADLINE is today!");
        } else {
            System.out.println("\tThe DEADLINE was " + Math.abs(daysLeft)  + " days ago! It's OVERDUE!");
        }

    }

    // ================== DISPLAY =====================
    public void display(){
        thinLine();
        System.out.println("\n= TASK DETAILS =");
        System.out.println("\tTitle: " + this.title);
        System.out.println("\tPriority Level: " + this.priorityLevel);
        dateAndTime();
        this.deadlineTracker(this.dueDate, this.month, this.year);
        System.out.println("\tTopic:  " + this.topic);
        System.out.println("\tDescription: " + this.description);
    }

    public void dateAndTime(){
        if (this.month == 1){
            System.out.println("\tDeadline: January" + " "+this.dueDate + "," + this.year);
        } else if (this.month == 2) {
            System.out.println("\tDeadline: February"  + " "+this.dueDate + "," + this.year);
        } else if (this.month == 3) {
            System.out.println("\tDeadline: March" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 4) {
            System.out.println("\tDeadline: April" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 5) {
            System.out.println("\tDeadline: May" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 6) {
            System.out.println("\tDeadline: June" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 7) {
            System.out.println("\tDeadline: July" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 8) {
            System.out.println("\tDeadline: August" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 9) {
            System.out.println("\tDeadline: September" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 10) {
            System.out.println("\tDeadline: October" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 11) {
            System.out.println("\tDeadline: November" + " "+this.dueDate + "," + this.year);
        }else if (this.month == 12) {
            System.out.println("\tDeadline: December" + " "+this.dueDate + "," + this.year);
        }
    }

    public void thinLine() {
        for (int i = 0; i < 35; i++) {
            System.out.print("--");
        }
    }


}
