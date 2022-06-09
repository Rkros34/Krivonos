package by.it_academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    /**
     * Создать класс Checker.
     * В нем должен быть метод timeOfDay, принимающий строку и возвращающий boolean.
     * Метод возвращает true, если строка представляет время в формате 'hh:mm:ss' - от 00:00:00 до 23:59:59.
     * Проверить класс Checker и его метод в main.
     */

    private static Boolean timeOfDay(String time) {
        Pattern pattern = Pattern.compile("^([01]?[0-9]|2[0-3]]):[0-5][0-9]:[0-5][0-9]$");
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(timeOfDay("72:41:51"));
    }
}
