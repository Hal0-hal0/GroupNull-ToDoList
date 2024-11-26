package finalproject;

public class Exam extends Activity{
    private String examType;

    public Exam(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject, String location, String examType) {
        super(title, priorityLevel, dueDate, month, topic, description, subject, location);
        this.examType = examType;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    //=================DISPLAY==================

    @Override
    public void display() {
        System.out.println("Exam Type: " + this.examType);
        super.display();
    }
}
