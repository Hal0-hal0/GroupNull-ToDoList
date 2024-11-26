package finalproject;

import java.util.TreeMap;

public class GroupProject extends Task implements  Equipment{
    private TreeMap<String, Materials> equipment;

    public GroupProject(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject) {
        super(title, priorityLevel, dueDate, month, topic, description, subject);
        this.equipment = new TreeMap<>();
    }

    public TreeMap<String, Materials> getEquipment() {
        return equipment;
    }

    public void setEquipment(TreeMap<String, Materials> equipment) {
        this.equipment = equipment;
    }

    @Override
    public void addEquipment(Materials material) {
        equipment.put(material.getMaterialName(), material);
    }

    @Override
    public void displayEquipment() {
        for (Materials materials : equipment.values()) {
            materials.display();
        }
    }

    @Override
    public void display() {
        super.display();
        displayEquipment();
    }
}
