package LinkedinLearningPath_Learn.Basics;

import java.util.Scanner;

public class Basics_06_StringBuilder {

    public static void main(String[] Args){

        StringBuilder sb = new StringBuilder("Welcome");
        sb.append("to New Jersey");
        String result = sb.toString();

        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        sb.append(input1);

        String input2 = sc.nextLine();
        sb.append(input2);

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();

        sb1.append(input1)
                .append(" '")
                .append(input2);

        System.out.println(sb1);



    }
}
