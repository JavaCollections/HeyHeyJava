package LinkedinLearningPath_Learn;

public class Basics_00_PrimitiveDataTypeDeclaration {

    public static void main(String[] Args){
        System.out.println("Noting from Basics_00");

    }

    public static void NumeralsDeclaration(){
        int i = 1;


    }

    public static void CharacterDeclaraionWithWrappers(){
        char c = 'g';

        char[] a = {'g','e','o','r','g','e'};

//      WRAPPER CASE MANIPULATION
        char uppercaseC = Character.toUpperCase(c);
        char lowercaseC = Character.toLowerCase(c);
        char titlecaseC = Character.toTitleCase(c);
//      UNICODE TO CHARACHTER
        char nine = '\u0039';
        char dollar = '\u0024';
//      CHARACTER TO STRING
        String s = new String(a);
        System.out.println("Converted String" + s);
//      STRING TO ARRAY
        char[] stringtochar = s.toCharArray();
    }

}
