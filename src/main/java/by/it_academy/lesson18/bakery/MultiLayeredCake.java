package by.it_academy.lesson18.bakery;

public class MultiLayeredCake extends Cake {
    private final Cake cake;

    public MultiLayeredCake(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered "+cake.getDescription();
    }
}
