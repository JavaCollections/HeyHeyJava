package LinkedinLearningPath_Learn.Basics;

public class Basics_12_Loops {

    private static String[] months =
            {"January", "Feburuary", "March", "April",
                    "May", "june", "July", "August", "Septermber", "October",
                    "November", "December"};

    public static void main(String[] Args) {

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
//      FOR EACH
        for (String month : months) {
            System.out.println(month);
        }

//      WHILE LOOP
        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }
//      DO WHILE
        int counterfordowhile = 0;

        do {
            System.out.println(months[counterfordowhile]);
            counterfordowhile++;

            if (counterfordowhile == 5) {
                break;
            }

        } while (counterfordowhile < months.length);
    }
}
