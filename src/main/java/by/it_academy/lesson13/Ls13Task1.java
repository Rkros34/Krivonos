package by.it_academy.lesson13;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Создать программу, которая будет генерировать случайный набор чисел.
 * Потом в разных потоках печатать:
 * отрицательные,
 * положительные четные
 * и положительные нечетные.
 */
public class Ls13Task1 {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();

        Collection<Integer> integerCollection = random.ints()
                .limit(100)
                .boxed().toList();


        Thread thread = new Thread(() -> getNegativeNumbers(integerCollection));
        thread.start();
        Thread thread1 = new Thread(() -> getPositiveNumbers(integerCollection));
        thread1.start();
        Thread thread2 = new Thread(() -> getPositiveOddNumbers(integerCollection));
        thread2.start();
    }

    private static void getPositiveOddNumbers(Collection<Integer> integerCollection) {
        List<Integer> positiveOdd = integerCollection.stream()
                .mapToInt(x -> x)
                .filter(x -> x > 0)
                .filter(x -> x % 2 != 0)
                .boxed().toList();
        System.out.println(positiveOdd);
    }

    private static void getPositiveNumbers(Collection<Integer> integerCollection) {
        List<Integer> positive = integerCollection.stream()
                .mapToInt(x -> x)
                .filter(x -> x > 0)
                .boxed().toList();
        System.out.println(positive);
    }

    private static void getNegativeNumbers(Collection<Integer> integerCollection) {
        List<Integer> negative = integerCollection.stream()
                .mapToInt(x -> x)
                .filter(x -> x < 0)
                .boxed().toList();
        System.out.println(negative);
    }
}
