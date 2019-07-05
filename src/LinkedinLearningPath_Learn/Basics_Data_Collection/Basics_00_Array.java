package LinkedinLearningPath_Learn.Basics_Data_Collection;

import LinkedinLearningPath_Learn.Basics_Data_Collection.M_DataCollection.M_00_Arrays_ClothingItems;

public class Basics_00_Array {

    public static void main(String[] Args) {

        System.out.println("Array of Primitives - Integers");

        int[] ints = {3, 6, 9};
        for (int ints1 : ints
        ) {
            System.out.println(ints1);
        }

        System.out.println("Array of Primitives - Strings");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        for (String color : colors
        ) {
            System.out.println(color);
        }

        System.out.println("Array of Classes - Clothing Items");
        M_00_Arrays_ClothingItems[] items = new M_00_Arrays_ClothingItems[3];

        items[0] = new M_00_Arrays_ClothingItems("Shirt","L", 19.99);
        items[1] = new M_00_Arrays_ClothingItems("Pants","34", 29.99);
        items[2] = new M_00_Arrays_ClothingItems("Tie","2inch", 9.99);

        for (M_00_Arrays_ClothingItems itemms: items
             ) {
            System.out.println(itemms);
        }

//        COPY OF AN ARRAY


    }

}
