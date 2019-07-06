package LinkedinLearningPath_Learn.Basics_DateAndTimes;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime_00_OlderAPI_Date_Class {

    public static void main(String[] args) {

//        DEFAULT FORMATING -
        Date now = new Date();
        System.out.println(now);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28); // OLD SYSTEM 0 - JANUARY
        Date d1 = gc.getTime();
        System.out.println(d1);

        gc.add(GregorianCalendar.DATE, 4);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));
    }
}
