package LinkedinLearningPath_Learn.Basics_Data_Collection;

import java.util.ArrayList;
import java.util.List;

public class Basics_01_Lists {

    public static void main(String[] Args) {
//      ARRAY LIST STRING DECLARATION
        List<String> states = new ArrayList<>();

        states.add("California");
        states.add("Oregon");
        states.add("New Jersey");
        states.add("New York");

        for (String state: states
             ) {
            System.out.println(state);
        }

//        ARRAY LIST INTEGER DECLARATION
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        for (Integer theint:ints
             ) {
            System.out.println(theint);
        }
//      REMOVING ITEMS FROM ARRAY LIST
        states.remove(1);
//      GETTING A VALUE USING INDEX
        String state = states.get(1);
        System.out.println(state);
//      FINDING THE POSITION OF AN ITEM
        int pos = states.indexOf("Oregon");
        System.out.println("Position is " + pos);
    }


}
