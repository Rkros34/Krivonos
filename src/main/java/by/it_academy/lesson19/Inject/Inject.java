package by.it_academy.lesson19.Inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Создать аннотацию Inject, она должна быть доступна во время выполнения и ставиться над полями класса.
 * Создать класс DependencyInjectionContainer - контейнер управления зависимостями.
 * Он должен содержать конструктор, принимающий несколько объектов типа Class,
 * объекты этого типа будут управляться контейнером.
 * Также он должен реализовывать метод <T> T get(Class<T> type),
 * который возвращает объект типа type. Этот объект должен быть настроен
 * (поля с аннотацией @Inject должны содержать настроенные зависимости)
 * должен создаваться один раз (несколько вызовов <T> T get(Class<T> type) должны возвращать один объект).
 * Если запрашивается зависимость типа, который не управляется контейнером - возникает исключение.
 * Например:
 * class Service {
 *
 * @Inject private Provider provider;
 * void use() {
 * System.out.println(provider.getString());
 * }
 * }
 * class Provider {
 * String getString() {
 * return "Hello";
 * }
 * }
 * public static void main(String[] args) {
 * DependencyInjectionContainer container = new DependencyInjectionContainer(List.of(Service.class, Provider.class));
 * Service service1 = container.get(Service.class);
 * Service service2 = container.get(Service.class);
 * <p>
 * System.out.println("service1 == service2 " + (service1 == service2)); //true
 * service1.use(); //Hello
 * container.get(DependencyInjectionContainer.class); //Exception
 * }В методе main протестировать DependencyInjectionContainer.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
