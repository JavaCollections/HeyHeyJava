package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism;

import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_01_ClothingItem;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_01_Shirt;

import javax.sound.midi.Soundbank;

public class IP_01_Inheritance_Polymorphism {

    public static void main(String[] Args) {
        M_01_ClothingItem Item = new M_01_ClothingItem("Shirt","L",19.99);
        System.out.println(Item);

        M_01_Shirt shirt = new M_01_Shirt("M",14.99);
        System.out.println(shirt);

        // POLYMORPHISM
        // A Shirt is a sub class of super class clothing item. And so it can be both types

        // USING GETTER AND SETTER
        // AND ALSO PATTER GET AND SET METHODS ARE NOT AVAILABLE IN THE SUPER CLASS
        shirt.setPattern("Plaid");
        System.out.println("This is the shirt's Pattern: " + shirt.getPattern());

        // CASTING TO SUPER CLASS
        // SHIRT TO CLOTHING ITEM - DEPENDS ON THE TYPE OF OBJECT AND THE CNSTRUCTOR THAT YOU ARE USING
        // UPCASTING - SUB CLASS TO HAVE ACCESS TO METHODS IN THE SUPER CLASS
        // METHODS ACCESS WILL BE FROM THE OBJECT
        M_01_ClothingItem reallyShirt = new M_01_Shirt("L",12.99);
        System.out.println("Really Shirt" + reallyShirt);
        // IF THIS 'REALLYSHIRT' NEEDS ACCESS TO THE METHODS OF THE SUB CLASS THEN CASTING IS REQUIRED AS BELOW
        // CLOTHING ITEM IS NOW CASTED TO SHIRT
        M_01_Shirt shirt2 = (M_01_Shirt) reallyShirt;
        shirt2.setPattern("Solid");
        System.out.println("Pattern = " + shirt2.getPattern());


        //




    }

}
