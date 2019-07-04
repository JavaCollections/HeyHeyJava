package LinkedinLearningPath_Learn.Basics;

public class Basics_21_Debugging {

    public static void main(String[] args) {
        String welcome = "Welcome !";
        char[] chars = welcome.toCharArray();
        for (char character : chars ) {
            System.out.println(character); // BREAKPOINT  CREATION
        }
    }
}
