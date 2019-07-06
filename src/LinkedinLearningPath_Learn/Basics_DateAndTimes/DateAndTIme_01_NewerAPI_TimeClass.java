package LinkedinLearningPath_Learn.Basics_DateAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTIme_01_NewerAPI_TimeClass {

    public static void main(String[] Args) {

        LocalDateTime ldt = LocalDateTime.now(); //COMPUTER READABLE FORMAT
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28); // Month API STARTS AT 1
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dtf.format(ld));

    }
}
