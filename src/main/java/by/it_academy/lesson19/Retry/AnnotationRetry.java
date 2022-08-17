package by.it_academy.lesson19.Retry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 1) Создать аннотацию Retry, она должна быть доступна во время выполнения и ставиться над методами.
 * В ней должен быть атрибут количества попыток. Создать InvocationHandler,
 * который будет пытаться повторно метод оригинального объекта в случае исключения.
 * Количество попыток определяется аннотацией Retry.
 * Например:
 * interface Test {
 * @Retry(10)}
 *  String getString();
 *   }
 * class TestImpl implements Test {
 *  @Override
 * public String getString() {
 * if (ThreadLocalRandom.current().nextInt(1, 11) <= 5) {
 *  throw new RuntimeException();
 *  }
 * return "Made it!";
 *   }
 * }
 *
 * public static void main(String[] args) {
 * Test test = (Test) Proxy.newProxyInstance(
 * RepeatableExample.class.getClassLoader(),
 * new Class[]{Test.class},
 * new RetryInvocationHandler(new TestImpl())
 * );
 *
 * for (int i = 0; i < 10; i++) {
 * System.out.println(test.getString());
 * }
 * }
 */

public class AnnotationRetry implements InvocationHandler {
    private final Object object;

    AnnotationRetry (Object object){
        this.object=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Retry annotation = method.getAnnotation(Retry.class);
        int countOfRetries = annotation == null ? 1: annotation.value();
        Throwable throwable=null;
        for (int i = 0; i < countOfRetries; i++) {
            try {
                return method.invoke(object,args);
            } catch (Throwable t) {
                throwable = t;
            }
        }
        throw Objects.requireNonNull(throwable);
    }
}
