package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

public class M_01_ClothingItem {

    // VARIABLES
    private String type;
    private String size;
    private double price;

    // TO STRING METHODS
    @Override
    public String toString() {
        return "M_00_ClothingItem{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    // CONSTRUCTOR
    public M_00_ClothingItem(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    // GETTER SETTER METHODS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
