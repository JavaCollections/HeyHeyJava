package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism;

import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_02_ClothingItem;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_02_Product_Interface;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_02_Shirt;

public class IP_02_Interface {

    public static void main(String[] Args) {

        M_02_ClothingItem Item = new M_02_ClothingItem("Shirt", "L", 19.99);
        displayProduct(Item);

        M_02_Shirt shirt = new M_02_Shirt("L", 29.99);
        displayProduct(shirt);
        shirt.setPattern("Plaid");
        System.out.println("This shirts Pattern is " + shirt.getPattern());

        M_02_ClothingItem reallyAShirt = new M_02_Shirt("L", 39.99);
        displayProduct(reallyAShirt);

        M_02_Shirt shirt2 = (M_02_Shirt) reallyAShirt;
        shirt2.setPattern("Solid");
        System.out.println("Pattern = " + shirt2.getPattern());

    }

    // OUTPUT IS OBTAINED FROM INTERFACE THIS INCREASES THE FLEXIBILITY
    // RATHER THAN BEING RESTRICTED TO CLOTHING ITEM, FOR EG YOU CAN USE TOOLS

    private static void displayProduct(M_02_Product_Interface product) {
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }

}
