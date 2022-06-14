package by.it_academy.lesson7;

/**
 * Имея строку, написать программу, которая ее перевернет.
 * Например: при 'some string' вывести на экран 'gnirts emos'.
 * Примечание: StringBuilder имеет метод reverse() - им пользоваться нельзя :)
 * Пользуйтесь методом append и циклами.
 */

public class Task3 {
    public static void main(String[] args) {
        String str="some string";
        char[] strToArray=str.toCharArray();
        StringBuilder word=new StringBuilder();
        for (int i= strToArray.length-1;i>=0;i--)
             {
                 word.append(strToArray[i]);
             }
        System.out.println(word);
        }
    }
