package by.it_academy.lesson8;

/**
 * Создать класс Cat, который наследуется от Animal.
 * У него должен быть конструктор, принимающий  имя,
 * и конструктор без параметров, который устанавливает имя 'Cat'.
 * У него должен быть дополнительный метод void purr() - который печатает 'X purrs', где X - имя животного.
 */
public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Cat");
    }

    void purr() {
        System.out.println(name + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kuzya");
        System.out.println(cat.name);
        cat.eat();
        cat.purr();
        cat.makeNoise();
        cat.eat();
    }
}
