package by.it_academy.lesson11;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("DELL");
        arrayList.add("5521");
        arrayList.add("HP");
        arrayList.add("ProBook");
        arrayList.add("1488");
        for (String word:arrayList) {
            try {
                System.out.println(Integer.parseInt(word));
            } catch (NumberFormatException e) {
                System.out.println(word+" is not a number");
            }

        }


    }
}
