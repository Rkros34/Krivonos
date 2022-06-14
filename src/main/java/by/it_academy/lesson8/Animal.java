package by.it_academy.lesson8;

import javax.lang.model.element.Name;

/**
 * Создать абстрактный класс Animal.
 * У него должен быть конструктор, принимающий имя.
 * У него должны быть методы:
 * String name() - возвращает имя,
 * void eat() - печатает 'X eats',
 * void sleep() - печатает 'X sleeps', где X - имя животного.
 */
public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    String returnName() {
        return name;
    }
    void eat(){
        System.out.println(name+" eats");
    }
    void sleep(){
        System.out.println(name+" sleeps");
    }
}
