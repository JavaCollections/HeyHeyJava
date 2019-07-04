package LinkedinLearningPath_Learn.Basics;

import java.util.Scanner;

public class Basics_24_Java_Runtime_Classes {

    // SCANNER CLASS - GET INPUT FROM THE USER
    public static void main(String[] Args) {
        System.out.println("Enter a Value: ");
        Scanner scanner = new Scanner(System.in);
        String ins = scanner.nextLine();
        System.out.println("Input Accquired : " + ins);
    }

}
