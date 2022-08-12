package by.it_academy.lesson16;

import java.util.*;
import java.util.concurrent.*;

/**
 * Необходимо синхронизировать класс H2O, так чтобы потоки, представляющие кислород и водород, образовывали молекулы воды.
 * Другими словами, молекулы должны образовывать последовательность из троек:
 * HHO, HOH или OHH.
 * Подсказка: у меня получилось с помощью двух Semaphore и одного CyclicBarrier.
 *
 * @author Maxim Tereshchenko
 */
class H2O {

    private static final List<String> LIST = new CopyOnWriteArrayList<>();
    private static final List<String> VALID = List.of("HHO", "HOH", "OHH");

    public static void main(String[] args) throws InterruptedException {
        H2O h2O = new H2O();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
            executorService.execute(h2O::hydrogen);
            executorService.execute(h2O::hydrogen);
            executorService.execute(h2O::oxygen);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        for (int i = 2; i < 3000; i += 3) {
            String result = LIST.get(i - 2) + LIST.get(i - 1) + LIST.get(i);
            if (!VALID.contains(result)) {
                throw new RuntimeException("Expected one of " + VALID + " but was " + result);
            }
        }
        System.out.println("OK!");
    }

    /**
     * Нужно изменить этот метод.
     */
    private final Semaphore semaphoreO = new Semaphore(1);
    private final Semaphore semaphoreH = new Semaphore(2);
    private final CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    private boolean tryWaitBarrier() throws InterruptedException {
        try {
            cyclicBarrier.await();
            return false;
        } catch (BrokenBarrierException e) {
            return true;
        }
    }

    public void hydrogen() {
        try {
            semaphoreH.acquire();
            while (tryWaitBarrier());
            LIST.add("H");
            cyclicBarrier.reset();
            semaphoreH.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Нужно изменить этот метод.
     */
    public void oxygen() {
        try {
            semaphoreO.acquire();
            while (tryWaitBarrier());
            LIST.add("O");
            cyclicBarrier.reset();
            semaphoreO.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
