package by.it_academy.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать переменную password.
 * Напечатать 'Welcome', если password равен 'Caput Draconis',
 * иначе "Forbidden"
 */
public class Task3 {
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите пароль");
        String password = reader.readLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Forbidden");
        }
    }
}
