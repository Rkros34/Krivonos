package by.it_academy.lesson10_11;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        arrayOfNumbers.add(5);
        arrayOfNumbers.add(7);
        arrayOfNumbers.add(78);
        arrayOfNumbers.add(1);
        arrayOfNumbers.add(9);
        arrayOfNumbers.add(98);
        arrayOfNumbers.add(24);
        arrayOfNumbers.add(23);
        System.out.println(average(arrayOfNumbers));
        printlnRange(arrayOfNumbers,4,99);
    }

    private static double average(ArrayList<Integer> arrayOfNumbers) {
        int count = 0;
        int sum = 0;
        for (int number : arrayOfNumbers
        ) {
            sum += number;
            count++;
        }
        return (double) sum / count;
    }

    private static void printlnRange(ArrayList<Integer> arrayOfNumbers, int lowerLimit, int upperLimit) {
        for (int i : arrayOfNumbers
        ) {
            if (i >= lowerLimit && i <= upperLimit) {
                System.out.println(i);
            }
        }
    }
}
