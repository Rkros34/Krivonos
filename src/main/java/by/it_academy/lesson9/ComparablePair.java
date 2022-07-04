package by.it_academy.lesson9;

public class ComparablePair<T extends Comparable<T>> implements Pair<T,T> {
    private final T left;
    private final T right;

    public ComparablePair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public T getLeft() {
        return left;
    }

    @Override
    public T getRight() {
        return right;
    }
    boolean isLeftGreaterThanRight(){
        return left.compareTo(right)>0;
    }
}
