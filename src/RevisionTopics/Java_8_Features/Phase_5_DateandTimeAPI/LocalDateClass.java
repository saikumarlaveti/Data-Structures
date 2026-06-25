package RevisionTopics.Java_8_Features.Phase_5_DateandTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //specific date
        LocalDate date1 = LocalDate.of(2026,1,15);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2025, Month.JULY,14);
        System.out.println(date2);


    }
}
