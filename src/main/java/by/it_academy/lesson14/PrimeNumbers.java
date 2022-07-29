package by.it_academy.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumbers {
    private static int getLimitFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        String limit = reader.readLine();
        return Integer.parseInt(limit);
    }

    private static void getPrimeNumbers() throws IOException {
        IntPredicate primeNumber = PrimeNumbers::isPrimeNumber;

        IntStream.iterate(2, num -> num + 1)
                .limit(getLimitFromUser())
                .filter(primeNumber)
                .forEach(System.out::println);
    }

    private static boolean isPrimeNumber(int number) {
        if (number != 2 && number % 2 == 0) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .filter(num -> num % 2 != 0)
                .noneMatch(num -> number % num == 0);
    }

    public static void main(String[] args) throws IOException {
        getPrimeNumbers();
    }
}
