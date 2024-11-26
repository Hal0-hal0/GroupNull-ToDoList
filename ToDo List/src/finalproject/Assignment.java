package finalproject;

public class Assignment extends Task{
    private String submissionFormat;
    private String type;


    public Assignment(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject, String submissionFormat, String type) {
        super(title, priorityLevel, dueDate, month, topic, description, subject);
        this.submissionFormat = submissionFormat;
        this.type = type;
    }

    public String getSubmissionFormat() {
        return submissionFormat;
    }

    public void setSubmissionFormat(String submissionFormat) {
        this.submissionFormat = submissionFormat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void display() {
        System.out.println("Submission Format: " + this.submissionFormat);
        System.out.println("Type: " + this.submissionFormat);
        super.display();
    }
}
