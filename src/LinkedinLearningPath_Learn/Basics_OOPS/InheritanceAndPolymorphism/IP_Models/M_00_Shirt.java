package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

public class M_00_Shirt extends M_00_ClothingItem{

    //If the super class in the extended class is not having a no arguments constructor
    // OR
    // to put in another way if the super class has only constructor that require values then we must call the super class constructor method withing the sub class

    public M_00_Shirt(String size, double price) {
        super("Shirt", size, price);
    }

}
