package finalproject;

import java.util.Calendar;

public abstract class Task {
    private String title;
    private String priorityLevel;
    private int dueDate;
    private int month;
    private String topic;
    private String description;
    private Subject subject;

    public Task(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject) {
        this.title = title;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.month = month;
        this.topic = topic;
        this.description = description;
        this.subject = subject;
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

    public String getTitle() {
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

    public void calendar(Integer dueDay, Integer dueMonth) {
        Calendar calendar = Calendar.getInstance();

        // Get current day, month, and year
        int currentDay = calendar.get(Calendar.DATE);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int currentYear = calendar.get(Calendar.YEAR);

        // Create a calendar for the due date
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(currentYear, dueMonth - 1, dueDay); // Months are 0-based

        // If the due date is in the past, check if it's for next year
        if (dueDate.before(calendar)) {
            dueDate.add(Calendar.YEAR, 1); // Move to the next year
        }

        // Calculate the difference in milliseconds
        long remainingMillis = dueDate.getTimeInMillis() - calendar.getTimeInMillis();

        // Convert milliseconds to days
        long remainingDays = remainingMillis / (24 * 60 * 60 * 1000);

        // Get the difference in months and days
        int remainingMonths = dueDate.get(Calendar.MONTH) - currentMonth;
        if (remainingMonths < 0) {
            remainingMonths += 12;
        }

        // Output the results
        if (remainingDays <= 0) {
            System.out.println("Remaining Time: Overdue");
        } else {
            System.out.println("Remaining Months: " + remainingMonths);
            System.out.println("Remaining Days: " + remainingDays);
        }
    }


    // ================== DISPLAY =====================
    public void display(){
        System.out.println("\n= TASK DETAILS =");
        System.out.println("Title: " + this.title);
        System.out.println("Priority Level: " + this.priorityLevel);
        System.out.println("Month: " + this.month);
        System.out.println("Due Date: " + this.dueDate);
        this.calendar(this.dueDate, this.month);
        System.out.println("Topic:  " + this.topic);
        System.out.println("Description: " + this.description);
    }


}
