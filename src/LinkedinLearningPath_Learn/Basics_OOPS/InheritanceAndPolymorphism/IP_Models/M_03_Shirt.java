package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

public class M_03_Shirt extends M_03_ClothingItem_Abstract {

    private String pattern = "Not set";

    public M_03_Shirt(String size, double price) {
        super("Shirt", size, price);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    @Override
    public double getPrice() {
        return 22.95;
    }
}
