package finalproject;

public class Materials {
    private String materialName;
    private int quantity;

    public Materials(String materialName, int quantity) {
        this.materialName = materialName;
        this.quantity = quantity;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "\tMaterial Name: " + materialName + ", Quantity: " + quantity;
    }

    public void display(){
        System.out.println("\n\t== MATERIALS ==");
        System.out.println(this);
    }
}
