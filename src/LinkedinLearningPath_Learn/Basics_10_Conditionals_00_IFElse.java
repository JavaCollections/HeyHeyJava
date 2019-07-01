package LinkedinLearningPath_Learn;

public class Basics_10_Conditionals_00_IFElse {

    public static void main(String[] Args) {
        int monthNumber = 4;

        if (monthNumber >= 0 && monthNumber <= 2) {
            System.out.println("Its January");
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("You are in Second Quarter");
        } else {
            System.out.println("It isnt January");
        }
    }

}
