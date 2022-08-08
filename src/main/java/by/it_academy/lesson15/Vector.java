package by.it_academy.lesson15;

public class Vector {

    private final int x;
    private final int y;

    private Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Vector() {
        this(0, 1);
    }

    Vector left() {
        return new Vector(-y, x);
    }

    Vector right() {
        return new Vector(y, -x);
    }

    void apply(int[] coordinates) {
        coordinates[0] += x;
        coordinates[1] += y;
    }
}
