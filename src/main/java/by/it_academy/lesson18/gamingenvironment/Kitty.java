package by.it_academy.lesson18.gamingenvironment;

public class Kitty implements Player{
    @Override
    public void interact(Obstacle obstacle) {
        System.out.print("Kitty has encountered a ");
        obstacle.action();
    }
}
