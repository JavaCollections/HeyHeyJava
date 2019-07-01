package LinkedinLearningPath_Learn;

public class Basics_02_MathClass {

    public static void main(String[] Args){
        Addition();

    }

    public static void Addition(){
        int v1 = 56;
        int v2 = 44;

        int value = v1 + v2;
        System.out.println("Addition Value: " + value);
    }

    public static void Subtraction(){
        int v1 = 56;
        int v2 = 44;

        int value = v1 - v2;
        System.out.println("Subtraction Result: " + value);
    }

    public static void Multiplication(){
        int v1 = 56;
        int v2 = 44;

        int value = v1 * v2;
        System.out.println("Multiplication Value: " + value);
    }

    public static void Division(){
        int v1 = 56;
        int v2 = 44;

        int value = v1/v2;
        System.out.println("Division Value: " + value);
    }

    public static void absoluteValue(){
        long v1 =  -56;
        double value = Math.abs(v1);
        System.out.println("Division Value: " + value);
    }

    public static void rounded(){
        double v1 = 56.121325231234235123479789;
        double value = Math.round(v1);
        System.out.println("Division Value: " + value);
    }



}
