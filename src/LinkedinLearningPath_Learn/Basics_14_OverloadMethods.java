package LinkedinLearningPath_Learn;

import java.util.Scanner;

public class Basics_14_OverloadMethods {

    public static void main(String[] Args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter Value 2: ");

        double result = addValues(s1, s2);
        System.out.println("The result is " + result);

        double result2 = addValues(s1, s2, s2, s1);
        System.out.println("The result is " + result2);
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double addValues(String... values) {
        double result = 0;
        for (String str: values ) {
            double d = Double.parseDouble(str);
            result += d;
        }
        return result;
    }


}
