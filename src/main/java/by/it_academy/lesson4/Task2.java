package by.it_academy.lesson4;

public class Task2 {
    /**
     * Создать массив с неотрицательными числами.
     * Напечатать звезды, количеством соответствующим цифре в массиве.
     * Например: для new int[]{1,2,3}; напечатать
     * *
     * **
     * ***
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] myArray = {20, 5, 5, 5, 20};
        for (int i : myArray) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}