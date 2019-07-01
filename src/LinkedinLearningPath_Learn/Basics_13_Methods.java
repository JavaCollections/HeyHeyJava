package LinkedinLearningPath_Learn;

import java.util.Scanner;

public class Basics_13_Methods {

    private static String[] months =
            {"January", "Feburuary", "March", "April",
                    "May", "june", "July", "August", "Septermber", "October",
                    "November", "December"};

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Month");
            String monthName = scanner.nextLine();
            if (monthName.length() == 0) {
                break;
            }
            int monNumber = getMonthNumber(monthName);
            if (monNumber == -1) {
                System.out.println("Month Not Found");
            } else {
                System.out.println(String.format("%s is month number %d",monthName,monNumber));
            }
        }
        loopMonths();
    }

    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }

    private static int getMonthNumber(String monthName) {
        for (int i = 0; i < months.length; i++) {
            if (monthName.equalsIgnoreCase(months[i])) {
                return i;
            }
        }
        return -1;
    }
}
