package finalproject;

public class Presentation extends Task{
    private String medium;

    public Presentation(String title, String priorityLevel, int dueDate, int month, int year, String topic, String description, Subject subject, String medium) {
        super(title, priorityLevel, dueDate, month, year, topic, description, subject);
        this.medium = medium;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    //==========DISPLAY=============

    @Override
    public void display() {
        System.out.println("\n==> TASK TYPE: Presentation");
        super.display();
        System.out.println("\tMedium: " + this.medium);

    }
}
