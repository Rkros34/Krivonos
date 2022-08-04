package by.it_academy.lesson15;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.concurrent.*;
import java.util.stream.LongStream;

public class Factorial {
    /**
     * Создать программу для подсчета факториала 100000.
     * Использовать параллельный стрим вместе с ForkJoinPool. Для умножения больших чисел использовать BigInteger.
     * Для печати результата можно использовать new DecimalFormat("0.###E0").format(bigInteger);
     *
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newWorkStealingPool();
        Future<BigInteger> future = service.submit(() -> LongStream.rangeClosed(1, 100000)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply));
        System.out.println(new DecimalFormat("0.###E0").format(future.get()));
    }
}
