package by.it_academy.lesson19.Retry;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Test test = (Test) Proxy.newProxyInstance(
                RepeatableExample.class.getClassLoader(),
                new Class[]{Test.class},
                new AnnotationRetry(new TestImpl())
        );

        for (int i = 0; i < 10; i++) {
            System.out.println(test.getString());
        }
    }
}
