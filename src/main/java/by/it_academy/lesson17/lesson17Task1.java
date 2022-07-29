package by.it_academy.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Создать программу, читающую даты, которые водит пользователь в консоли.
 * Пользователь может вводить их в одном из 4 форматов: 2011-12-03, 20111203, 03 12 2011, 03/12/2011.
 * Если программа распознала дату, она печатает ее в ответ в ISO формате.
 */

public class lesson17Task1 {
    public static void main(String[] args) throws IOException {
        final List<String> dateFormats = List.of("yyyy-MM-dd", "yyyyMMdd", "dd MM yyyy", "dd/MM/yyyy");
        String date = getDateFromConsole();
        for (String format : dateFormats) {
            LocalDate localDate = tryFormat(DateTimeFormatter.ofPattern(format), date);
            if (localDate != null) {
                System.out.println(localDate);
            }
        }
    }

    private static String getDateFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a date in format: 2011-12-03, 20111203, 03 12 2011 or 03/12/2011");
        String dateString = reader.readLine();
        return dateString;
    }

    private static LocalDate tryFormat(DateTimeFormatter dtf, String dateString) {
        try {
            return LocalDate.parse(dateString, dtf);
        } catch (DateTimeException e) {
            return null;
        }
    }
}
