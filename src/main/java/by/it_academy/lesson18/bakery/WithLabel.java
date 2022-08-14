package by.it_academy.lesson18.bakery;

public class WithLabel extends Cake{
    private final Cake cake;
    private final String x;

    public WithLabel(Cake cake, String x) {
        this.cake = cake;
        this.x = x;
    }

    @Override
    public String getDescription() {
        return cake.getDescription()+" with saying "+x;
    }
}
