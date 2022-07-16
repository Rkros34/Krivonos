package by.it_academy.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Написать программу, которая будет читать числа с консоли от пользователя.
 * Ввод прекращается, после того как пользователь введет -1.
 * После этого программа должна напечатать уникальные числа, отсортированные по убыванию, в диапазоне [1;5].
 * Использовать Stream API.
 */

public class lesson14 {

    public static void main(String[] args) throws IOException {
        List<Integer> resultOfSorting = inputNumberFromConsole().stream()
                .filter(number->number>0)
                .filter(number->number<6)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(resultOfSorting);
    }

    private static List<Integer> inputNumberFromConsole() throws IOException {
        List<Integer> listOfNumber = new ArrayList<>();
        System.out.println("Input a number. If you want to finish input -1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String number=reader.readLine();
            if (!number.isEmpty()){
                if (Integer.parseInt(number)==-1){
                    System.out.println("End");
                    break;
                }else {
                    listOfNumber.add(Integer.parseInt(number));
                }
            }else {
                System.out.println("End");
                break;
            }
        }
        return listOfNumber;
    }
}
