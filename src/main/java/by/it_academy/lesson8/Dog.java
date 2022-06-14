package by.it_academy.lesson8;

/**
 * Создать класс Dog, который наследуется от Animal.
 * У него должен быть конструктор, принимающий имя,
 * и конструктор без параметров, который устанавливает имя 'Dog'.
 * У него должен быть дополнительный метод void bark() - который печатает 'X barks', где X - имя животного.
 */
public class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this("dog");
    }

    void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        System.out.println(dog.name);
        dog.bark();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
    }
}
