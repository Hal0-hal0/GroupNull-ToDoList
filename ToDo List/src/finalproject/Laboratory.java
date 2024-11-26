    package finalproject;

    import java.util.TreeMap;

    public class Laboratory extends Activity implements  Equipment{
        private TreeMap<String,Materials> equipment;

        public Laboratory(String title, String priorityLevel, int dueDate, int month, String topic, String description, Subject subject, String location) {
            super(title, priorityLevel, dueDate, month, topic, description, subject, location);
            this.equipment = new TreeMap<>();
        }

        public TreeMap<String, Materials> getEquipment() {
            return equipment;
        }

        public void setEquipment(TreeMap<String, Materials> equipment) {
            this.equipment = equipment;
        }

        //Add In treemap
    //    public void addMaterial(String key, Integer material) {
    //        materials.put(key, material);
    //    }

        //This is method add vslues in tree map, also shows relationshinp to Materials Class. also put this on a Interface class
//        public void addMaterial(Materials material) {
//            equipment.put(material.getMaterialName(), material);
//        }

        //Display treemap
//        public void displayMaterials() {
//            for (Materials materials : equipment.values()) {
//                materials.display();
//            }
//        }

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
