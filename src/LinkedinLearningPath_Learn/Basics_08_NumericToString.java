package LinkedinLearningPath_Learn;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Basics_08_NumericToString {

    public static void main(String[] Args){
        double doubleValue = 1_234_567.8;

        // PRINTING IN DOUBLE FORMAT
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        // PRINTING A INT IN SPECFIC FORMAT
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        // PRINTING WITHOUT GROUPING COMMAS
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        // PRINTING IN A SPECIFIC COUNTRY FORMAT
        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        // CURRENCY VALUES
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));

        // DECIMAL FORMAT
        DecimalFormat df = new DecimalFormat("$000.00");
        System.out.println(df.format(1));
        System.out.println(df.format(5.819));
    }


}
