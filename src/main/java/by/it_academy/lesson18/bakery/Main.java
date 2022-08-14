package by.it_academy.lesson18.bakery;

/**
 * Нужно изменить код, чтобы заказ мог содержать сложные составные пирожные, применив шаблон Декоратор.
 * Нужно добавить классы:
 * MultiLayeredCake - добавляет 5 к стоимости и 'Multi-layered' в начале имени пирожного.
 * Sprinkles - добавляет 2 к стоимости и 'with sprinkles' в конце имени пирожного.
 * WithLabel - добавляет 'with saying X' в конце имени пирожного, где X - передается в конструктор.
 * Добавить новое пирожное StrawberryCake, которое стоит в 2 раза больше обычного.
 * Добавить в заказ такие пирожные, чтобы в консоль напечаталось:
 * Chocolate cake
 * Vanilla cake with saying "PLAIN!"
 * Vanilla cake with sprinkles with saying "FANCY"
 * Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
 *
 * @author Maxim Tereshchenko
 */
class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new WithLabel(new VanillaCake(),"PLAIN!"));
        order.addCake(new WithLabel (new Sprinkles(new VanillaCake()), "FANCY"));
        order.addCake(new MultiLayeredCake(new WithLabel(new WithLabel(new Sprinkles(new Sprinkles(new StrawberryCake())),"One of"), "EVERYTHING")));
        order.printOrder();
    }
}
