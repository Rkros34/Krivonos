package by.it_academy.lesson16;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * Необходимо синхронизировать класс PrintInOrder, таким образом, чтобы 3 потока всегда
 * печатали 123 последовательно.
 * Подсказка: у меня получилось с помощью двух CountDownLatch.
 *
 * @author Maxim Tereshchenko
 */
class PrintInOrder {

    private final List<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            for (int i = 0; i < 1000; i++) {
                PrintInOrder printInOrder = new PrintInOrder();
                List<Runnable> tasks = new ArrayList<>();
                tasks.add(printInOrder::first);
                tasks.add(printInOrder::second);
                tasks.add(printInOrder::third);
                Collections.shuffle(tasks);
                List<? extends Future<?>> futures = tasks.stream()
                        .map(executorService::submit)
                        .collect(Collectors.toList());
                for (Future<?> future : futures) {
                    future.get();
                }
                printInOrder.verify();
            }
        } finally {
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        }
    }
    private final CountDownLatch countDownLatchSecond =new CountDownLatch(1);
    private final CountDownLatch countDownLatchThird = new CountDownLatch(1);

    /**
     * Нужно изменить этот метод.
     */
    public void first() {
        try {
            countDownLatchSecond.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list.add("1");
        second();
    }

    /**
     * Нужно изменить этот метод.
     */
    public void second() {
        try {
            countDownLatchThird.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list.add("2");
        countDownLatchSecond.countDown();
        third();

    }

    /**
     * Нужно изменить этот метод.
     */
    public void third() {
        list.add("3");
        countDownLatchThird.countDown();
    }

    public void verify() {
        if (!Arrays.asList("1", "2", "3").equals(list)) {
            throw new RuntimeException("Expected [1, 2, 3] but was " + list);
        }
    }
}
