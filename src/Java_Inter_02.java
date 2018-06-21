import java.sql.SQLOutput;

public class Java_Inter_02 {
    public static void main(String[] args){
        String s = "buckyrobertsbuckyroberts";

        System.out.println(s.indexOf("rob"));

        String a = "Bacon";
        String b = "monster";
        String c = "    Flying    ";

        //Concatenation
        System.out.println(a.concat(b));

        //Replace
        System.out.println(a.replace('B','F'));

        //Case Manipulation
        System.out.println(b.toUpperCase());

        System.out.println(a.toLowerCase());

        //Trim
        System.out.println(c.trim());

    }
}
