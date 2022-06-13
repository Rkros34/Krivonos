package by.it_academy.lesson8;

/**
 * Создать класс Counter, который будет содержать поле int value.
 * Создать конструкторы:
 * Counter(int startValue) - устанавливает начальное значение value на startValue;
 * Counter() - устанавливает начальное значение 0.
 * Создать методы:
 * int value() - текущее значение счетчика,
 * void increase() - увеличивает значение на 1,
 * void decrease() - уменьшает значение на 1,
 * void increase(int increaseBy) - увеличивает на указанное значение,
 * void decrease(int decreaseBy) - уменьшает на указанное значение.
 * Попробуйте переиспользовать методы для уменьшения дублирования кода.
 * В методе main протестировать функционал.
 */

public class Counter {
    int value;
    public Counter(int startValue){
        value=startValue;
    }
    public Counter(){
        this(0);
    }
    int value(){
        return value;
    }
    void increase(int increaseBy){
        value+=increaseBy;
    }
    void decrease(int decreaseBy){
        value-=decreaseBy;
    }

    public static void main(String[] args) {
        Counter counter=new Counter(69);
        counter.increase(1);
        System.out.println(counter.value);
        counter.increase(94);
        System.out.println(counter.value);
        counter.decrease(1);
        System.out.println(counter.value);
        counter.decrease(14);
        System.out.println(counter.value);
    }
}
