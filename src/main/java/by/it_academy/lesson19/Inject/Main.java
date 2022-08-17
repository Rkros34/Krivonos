package by.it_academy.lesson19.Inject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DependencyInjectionContainer container = new DependencyInjectionContainer(List.of(Service.class, Provider.class));
        Service service1 = container.get(Service.class);
        Service service2 = container.get(Service.class);

        System.out.println("service1 == service2 " + (service1 == service2)); //true
        service1.use(); //Hello
        container.get(DependencyInjectionContainer.class); //Exception
    }
}
