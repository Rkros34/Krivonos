package by.it_academy.lesson19.Inject;

public class Service {
    @Inject
    private Provider provider;

    void use() {
        System.out.println(provider.getString());
    }
}
