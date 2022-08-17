package by.it_academy.lesson19.Retry;

public interface Test {
    @Retry(10)
    String getString();
}
