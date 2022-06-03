package by.it_academy.lesson4;

/**
 * Создать массив чисел.
 * Напечатать числа разделенные запятой и пробелом в одну строчку.
 * Например: для new int[]{5, 1, 3, 4, 2};
 * напечатать 5, 1, 3, 4, 2
 */
public class Task1 {
    public static void main(String[] args) {
        int[] myArray = {5, 1, 3, 4, 2};
        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                System.out.print(myArray[i]);
            } else {
                System.out.print(myArray[i] + ", ");
            }

        }
    }
}
