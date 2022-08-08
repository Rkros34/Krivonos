package by.it_academy.lesson15;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Создать класс Robot implements Runnable, объявить конструктор принимающий:
 * String name - имя,
 * int delay - задержка между действиями,
 * String actions - строка, которая может содержать буквы L,R,F. В методе main сымитировать гонку нескольких роботов.
 * Роботы высаживаются на Марс, имеют начальную позицию [0,0]
 * по двумерной системе координат и обращены лицом на север (вверх).
 * Роботы выполняют команды по одной:
 * L - повернуться на 90 градусов влево
 * R - повернуться на 90 градусов вправо
 * F - продвинуться вперед на 1 единицу.
 * В процессе гонки печатаются каждого робота: 'X turns L', 'X turns R', 'X moves', где X - имя.
 * Гонка заканчивается, когда все роботы выполнили свои действия.
 * По окончании гонки печатаются имя и окончательные координаты каждого робота.
 * Использовать ExecutorService и Future.
 */
public class Robot implements Runnable {
    private final String name;
    private final int delay;
    private final String actions;

    Robot(String name, int delay, String actions) {
        this.name = name;
        this.delay = delay;
        this.actions = actions;
    }

    @Override
    public void run() {
        Vector vector = new Vector();
        int[] position = new int[]{0, 0};
        for (int i = 0; i < actions.length(); i++) {
            if (actions.charAt(i) == 'F') {
                vector.apply(position);
            } else if (actions.charAt(i) == 'L') {
                vector = vector.left();
            } else if (actions.charAt(i) == 'R') {
                vector = vector.right();
            }
            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            System.out.println("Name: "+name+" Position "+ Arrays.toString(position));
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Robot("Joe", 3, "FRFLLFRF"));
        executorService.submit(new Robot("Bill", 1, "FFFFFLF"));
        executorService.submit(new Robot("Jim", 2, "LFRF"));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}