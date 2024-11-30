package finalproject;

public class Activity extends Task{
    private String location;


    public Activity(String title, String priorityLevel, int dueDate, int month, int year, String topic, String description, Subject subject, String location) {
        super(title, priorityLevel, dueDate, month, year, topic, description, subject);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void display(){
        super.display();
        System.out.println("Location: " + this.location);
    }
}
