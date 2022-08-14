package by.it_academy.lesson18.bakery;

public class StrawberryCake extends Cake {
    @Override
    public int getCost() {
        return super.getCost() * 2;
    }

    @Override
    public String getDescription() {
        return "StrawberryCake";
    }
}
