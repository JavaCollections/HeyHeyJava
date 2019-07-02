package LinkedinLearningPath_Learn;

public class Basics_23_TryCatchWithCheckedAndUncheckedExceptions {

    public static void main(String[] args) {

        try {
            String Welcome = "Welcome";
            char[] chars = Welcome.toCharArray();
            char lastchar = chars[Welcome.length() - 1];
            System.out.println("Last Character is " + lastchar);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
            e.printStackTrace();
            return;
        } catch (Exception e ) {
            System.out.println("Any Exception");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // CALL TO DO SOIMETHING WITH AN EXCEPTION HANDLING FROM LINE 38
        try {
            doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Code ran Successfully");
    }


    public static void doSomething() throws InterruptedException { // DECLARING THE EXCEPTION IN THE METHOD DECLARION, IN WHICH CASE WHEN CALLED THE EXCEPTION NEEDS TO BE HANDLED
        Thread.sleep(1000);

    }

}
//UNCHECKED EXCEPTION
// ANY Exception Class which has RUNTIME EXCEPTION in its hierarchy is an unchecked exception,

//CHECKED EXCEPTION
// These need to be declared

