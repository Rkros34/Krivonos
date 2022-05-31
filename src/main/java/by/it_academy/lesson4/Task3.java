package by.it_academy.lesson4;

public class Task3 {
    /**
     * Создать массив чисел.
     * Напечатать сумму чисел в массиве.
     * Например: для для new int[]{5, 1, 3, 4, 2}; напечатать 15.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] myArray = {5, 1, 3, 4, 2};
        int Summ = 0;
        for (int i : myArray) {
            Summ =Summ+i;
        }
        System.out.println(Summ);
    }
}
