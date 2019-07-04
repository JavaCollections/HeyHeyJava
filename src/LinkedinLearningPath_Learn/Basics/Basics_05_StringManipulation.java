package LinkedinLearningPath_Learn.Basics;

public class Basics_05_StringManipulation {

    public static void main(){

        String item = new String("HelloString");
        String string1 = "Hello";
        String item1;

//      STRING CONCATENATION
        String s = "Greetings: ";
        String p = "Welcome Human";
        String z = s + p;
        z += ", Seedlings";

        // CASE MANIPULATION
        String s2 = s.toUpperCase();

//      FIND THE FOURTH CHARACTER LIKE ARRAY
        System.out.println(s.charAt(4));
//      GET BYTES
        System.out.println(s.getBytes());

        //      STRING CONVERSION METHODS
        int intValue = 28;
        String fromInt = Integer.toString(intValue);

        boolean b = true;
        String frombook = Boolean.toString(b);

        long longValue = 10_000_000;
        String fromLong = Long.toString(longValue);

//        STRING FORMATTING
        String shopping = String.format("Shirt Size: %s, Qty:%d","L",4);




    }
}
