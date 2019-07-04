package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism;

import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_00_ClothingItem;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_00_Shirt;

public class IP_00_Inheritance_Extends {

    public static void main(String[] Args) {
        M_00_ClothingItem Item = new M_00_ClothingItem("Shirt", "L", 19.99);
        System.out.println(Item);

        M_00_Shirt shirt = new M_00_Shirt("M", 24.44);
        System.out.println(shirt); // IN THIS STEP - TO STRING METHOD IS BEING INHERITED BY THE SHIRT CLASS
    }

}
