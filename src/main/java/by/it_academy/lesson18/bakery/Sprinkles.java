package by.it_academy.lesson18.bakery;

public class Sprinkles extends Cake {
    private final Cake cake;

    public Sprinkles(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return cake.getDescription()+" with sprinkles";
    }
}
