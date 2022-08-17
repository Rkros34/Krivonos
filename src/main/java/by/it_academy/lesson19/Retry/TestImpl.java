package by.it_academy.lesson19.Retry;

import java.util.concurrent.ThreadLocalRandom;

public class TestImpl implements Test {

    @Override
    public String getString() {
        if (ThreadLocalRandom.current().nextInt(1, 11) <= 5) {
            throw new RuntimeException();
        }
        return "Made it!";
    }
}
