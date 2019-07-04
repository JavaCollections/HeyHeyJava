package LinkedinLearningPath_Learn.Basics;

import java.util.Scanner;

public class Basics_25_Java_Static_Methods {

    public static void main(String[] Args) {
        String ins = getInput();
        System.out.println("Input Accquired : " + ins);

        String ins1 = getInput1("Enter the Value for Input1");
        System.out.println("Input Accquired : " + ins1);

    }

    private static String getInput() {
        System.out.println("Enter a Value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String getInput1(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
