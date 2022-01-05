package day_converter;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class BirthDayConverter {
    public static void main(String[] args) {
        System.out.println(getWeekdayOfBirthday("30.05.1984", "2015"));
        System.out.println(getWeekdayOfBirthday("22.02.2001", "2022"));
    }

    public static String getWeekdayOfBirthday(String birthday, String year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate localDate = LocalDate.parse(birthday, formatter);

        LocalDate ld = localDate.withYear(Year.parse(year).getValue());

        Locale locale = Locale.ENGLISH;
        String res = ld.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);

        return res;
    }
}
