package by.it_academy.lesson6;

/**
 * Создать класс Whistle.
 * Добавить поле String sound.
 * Создать конструктор Whistle(String whistleSound), который сохраняет whistleSound в поле sound.
 * Создать метод void sound() в классе Whistle, который печатает звук из поля sound
 */
public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {
        sound = whistleSound;
    }

    public static void main(String[] args) {
        Whistle whistle = new Whistle("FWEEEET");
        Whistle whistle2 = new Whistle("another");
        whistle.sound();
        whistle2.sound();
    }

    void sound() {
        System.out.println(sound);
    }
}

