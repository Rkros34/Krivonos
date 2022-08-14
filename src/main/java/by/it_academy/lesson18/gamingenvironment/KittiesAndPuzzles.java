package by.it_academy.lesson18.gamingenvironment;

public class KittiesAndPuzzles implements GameElementFactory {
    @Override
    public Player player() {
        return new Kitty();
    }

    @Override
    public Obstacle obstacle() {
        return new Puzzle();
    }
}
