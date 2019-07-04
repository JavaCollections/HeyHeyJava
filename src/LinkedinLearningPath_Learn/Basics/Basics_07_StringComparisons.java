package LinkedinLearningPath_Learn.Basics;

public class Basics_07_StringComparisons {
    public static void main(String[] Ar){
        String s1 = "Hello!";
        String s2 = "Hello!";

        if (s1 == s2){
            System.out.println("They Match");
        } else {
            System.out.println("They dont Match");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        if (s3 == s4){
            System.out.println("They Match");
        } else {
            System.out.println("They dont match");
        }

//        CORRECT AND PREFFERED WAY
        if (s3.equals(s4)){
            System.out.println("They Match");
        } else {
            System.out.println("They dont match");
        }

        if (s3.equalsIgnoreCase(s4)){
            System.out.println("They Match");
        } else {
            System.out.println("They dont match");
        }
    }
}
