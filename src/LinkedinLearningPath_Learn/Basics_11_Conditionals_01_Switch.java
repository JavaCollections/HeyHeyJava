package LinkedinLearningPath_Learn;

public class Basics_11_Conditionals_01_Switch {

    public static void main(String[] Args) {
        int month = 2;

        switch (month) {
            case 0:
                System.out.println("Its January");
                break;
            case 2:
                System.out.println("Its Feburary");
                break;
            case 3:
                System.out.println("Its March");
                break;
            case 4:
                System.out.println("Its April");
                break;
            default:
                System.out.println("Its Some other month");
                break;
        }
    }
}
