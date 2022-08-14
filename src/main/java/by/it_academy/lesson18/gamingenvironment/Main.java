package by.it_academy.lesson18.gamingenvironment;

/**
 * Требуется создать интерфейс Player с методом void interact(Obstacle obstacle),
 * интерфейс Obstacle с методом void action().
 * Создать класс GameEnvironment который может запускать разные игры, у него будет метод void play().
 * Нужно иметь возможность запускать разные игры в классе GameEnvironment, с помощью шаблона
 * абстрактной фабрики.
 * Например:
 * class Kitty implements Player {
 * <p>
 * public void interact(Obstacle ob) {
 * System.out.print("Kitty has encountered a ");
 * ob.action();
 * }
 * }
 * class Puzzle implements Obstacle {
 * <p>
 * public void action() {
 * System.out.println("Puzzle");
 * }
 * }
 * public static void main(String[] args) {
 * var gameEnvironment = new GameEnvironment(new KittiesAndPuzzles());
 * gameEnvironment.play(); //Kitty has encountered a Puzzle
 * }
 *
 * @author Maxim Tereshchenko
 */
class Main {

    public static void main(String[] args) {
        var gameEnvironment = new GameEnvironment(new KittiesAndPuzzles());
        gameEnvironment.play();
    }
}
