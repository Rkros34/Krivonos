package by.it_academy.lesson13;

/**
 * Создать программу, которая напечатает состояния потока
 * NEW, RUNNABLE, TIMED_WAITING, WAITING, TERMINATED.
 */

public class Ls13Task2 {
    public static void main(String[] args) throws InterruptedException {
        printNew();
        printRunnable();
        printWaiting();
        printTimedWaiting();
        printTerminated();
    }

    private static void printWaiting() throws InterruptedException {
        Thread endless = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) ;
            }
        });
        Thread waiting = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    endless.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        endless.start();
        waiting.start();
        Thread.sleep(666);
        System.out.println(waiting.getState());
        endless.interrupt();
        endless.join();
        waiting.join();
    }

    private static void printTerminated() throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        thread.join();
        System.out.println(thread.getState());
    }

    private static void printTimedWaiting() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        thread.start();
        Thread.sleep(777);
        System.out.println(thread.getState());
        thread.interrupt();
        thread.join();
    }

    private static void printRunnable() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) ;
            }
        });
        thread.start();
        System.out.println(thread.getState());
        thread.isInterrupted();
        thread.join();
    }

    private static void printNew() {
        System.out.println(new Thread().getState());
    }
}
