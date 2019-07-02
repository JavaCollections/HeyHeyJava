package LinkedinLearningPath_Learn;

public class Basics_23_TryCatchWithCheckedAndUncheckedExceptions {

    public static void main(String[] args) {
        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length]; //EXCEPTION CREATED ArrayIndexOutOfBoundsException
            System.out.println("Last Char: " + lastChar);

            String nothing = null;
            System.out.println(nothing.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
            e.printStackTrace();
            return;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer exception ");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Mother Exception Captured");
            e.printStackTrace();
        }
        System.out.println("Code ran Successfully");
    }

}
