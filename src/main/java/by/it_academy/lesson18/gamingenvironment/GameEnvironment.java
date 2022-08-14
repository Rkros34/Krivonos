package by.it_academy.lesson18.gamingenvironment;

/**
 * @author Maxim Tereshchenko
 */
class GameEnvironment {

    private final GameElementFactory factory;

    GameEnvironment(GameElementFactory factory) {
        this.factory = factory;
    }

    void play() {
        factory.player().interact(factory.obstacle());
    }
}
