package by.it_academy.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать переменную с буквенной оценкой - grade.
 * Если grade имеет значение 'A' - вывести в консоль 'Distinction';
 * если 'B' либо 'C' - 'First class';
 * 'D' - 'You have passed';
 * 'F' - 'Fail. Try again'.
 * При других значениях - 'Invalid grade'
 */
public class Task2 {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Укажите Вашу оценку c заглавной буквы латиницей");
        String grade = reader.readLine();
        if (grade.equals("A")) {
            System.out.println("Distinction");
        } else if (grade.equals("B") || grade.equals("C")) {
            System.out.println("First class");
        } else if (grade.equals("D")) {
            System.out.println("You have passeds");
        } else if (grade.equals("F")) {
            System.out.println("Fail. Try again");
        } else{
            System.out.println("Invalid grade");
        }
    }
}