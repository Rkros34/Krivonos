package by.it_academy.lesson6;

/**
 * Создать класс Whistle.
 * Добавить поле String sound.
 * Создать конструктор Whistle(String whistleSound), который сохраняет whistleSound в поле sound.
 * Создать метод void sound() в классе Whistle, который печатает звук из поля sound
 */

public class Whistle {
    private static String sound;

    // конструктор для класса Whistle
    public Whistle(String whistleSound) {
        sound = whistleSound;
    }

    void sound() {
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Whistle whistle = new Whistle("FWEEEET");
        whistle.sound();
    }
}

