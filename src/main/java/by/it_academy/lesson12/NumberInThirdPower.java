package by.it_academy.lesson12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberInThirdPower {

    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number or \"End\" if you want finished");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number = 0;
            if (line.contains("End")) {
                System.out.println("Good Bye");
                break;
            }
            try {
                number = Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.println("You didn't enter a number!");
                continue;
            } {
                numbers.add(Integer.valueOf(line));
                System.out.println(line);
            }

            try (Writer writer = new FileWriter("Number in third power")) {
                for (int digit : numbers) {
                    double thirdPower = Math.pow(digit, 3);
                    writer.write(String.valueOf(thirdPower));
                    writer.write(System.lineSeparator());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
