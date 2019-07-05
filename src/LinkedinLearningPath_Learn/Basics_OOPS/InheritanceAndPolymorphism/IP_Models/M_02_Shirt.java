package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

public class M_02_Shirt extends M_02_ClothingItem {

    private String pattern = "Not set";

    public M_02_Shirt(String size, double price) {
        super("Shirt", size, price);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


}
