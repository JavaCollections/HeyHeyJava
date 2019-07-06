package LinkedinLearningPath_Learn.Basics_Data_Collection;

import java.util.HashMap;
import java.util.Map;

public class Basics_02_Map_KeyValuePairs {
    public static void main(String[] Args) {

        Map<String, String> map = new HashMap<>();

        map.put("California", "Sacremento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

//        ADDING AN ITEM - UNORDERED LIST
        map.put("Alaska", "Junew");
        System.out.println(map);

//        GET AN ITEM
        String capital = map.get("Oregon");
        System.out.println(capital);
//      DELETE AN ITEM

        map.remove("California");
        System.out.println(map);
    }
}
