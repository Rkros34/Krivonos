package by.it_academy.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Напечатать все пятницы 13-ое за годы [start;end], которые вводит пользователь в консоли.
 */

public class Ls17Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println(getCountOfFridays13());
    }
    private static int getCountOfFridays13() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Specify the range of years in which you want to know the number of Fridays 13");
        int startYear = Integer.parseInt(reader.readLine());
        int lastYear = Integer.parseInt(reader.readLine());
        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        int countOfFridays13 = 0;
        while (startDate.getYear() != lastYear) {
            if (startDate.getDayOfWeek() == DayOfWeek.FRIDAY && startDate.getDayOfMonth() == 13) {
                countOfFridays13 += 1;
            }
            startDate = startDate.plusDays(1);
        }
        return countOfFridays13;
    }
}