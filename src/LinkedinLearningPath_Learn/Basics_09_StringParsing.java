package LinkedinLearningPath_Learn;

public class Basics_09_StringParsing {
    public static void main(String[] Args){
        String S1 = "Welcome to California!";
        int lenOfString = S1.length();
        System.out.println(lenOfString);

        int pos = S1.indexOf("California");
        System.out.println(pos);

        String sub = S1.substring(11);
        System.out.println(sub);

        String S2 = "       Welcome!       ";
        String trimmed = S2.trim();
        System.out.println(trimmed);
    }
}
