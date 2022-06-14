package by.it_academy.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать массив строчек в формате 'имя,год рождения'.
 * Напечатать самое длинное имя и средний год рождения.
 * Например: для new String[]{"sebastian,2015", "lucas,2017"}; должно быть на экране:
 * sebastian
 * 2016.0
 */
public class Task1 {
    public static void main(String[] args) {
        String[] arrayOfPeople = new String[]{"egor,2002", "andrew,1996", "elena,2000", "maximilianNagibator,2007"};
        int sum = 0;
        float avgSum = 0;
        String maxName = null;
        int maxLengthName = 0;
        for (String people : arrayOfPeople) {
            String[] nameAndYears = people.split(",");
            sum += Integer.parseInt(nameAndYears[1]);
            if (nameAndYears[0].length() > maxLengthName) {
                maxLengthName = nameAndYears[0].length();
                maxName = nameAndYears[0];
            }
        }
        avgSum = sum / arrayOfPeople.length;
        System.out.println(avgSum);
        System.out.println(maxName);
    }
}


