package by.it_academy.lesson19.Inject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

public class DependencyInjectionContainer {
    private final Collection<Class> collectionOfObjects;
    private final HashMap<Class, Object> hashMap = new HashMap<>();

    public DependencyInjectionContainer(Collection<Class> collectionOfObjects) {
        this.collectionOfObjects = collectionOfObjects;
    }

    private Object create(Class type) {
        try {
            Object instance = type.getDeclaredConstructor().newInstance();
            for (Field field : type.getDeclaredFields()) {
                if (field.getAnnotation(Inject.class) != null) {
                    field.setAccessible(true);
                    field.set(instance, get(field.getType()));
                }
            }
            return instance;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            return null;
        }
    }

    <T> T get(Class<T> type) {
        if (!collectionOfObjects.contains(type)) {
            throw new RuntimeException();
        }
        Object object = hashMap.get(type);
        if (object == null) {
            object = create(type);
            hashMap.put(type, object);
        }
        return type.cast(object);
    }
}
