package by.it_academy.lesson9;

public class StringPair extends ComparablePair<String>{
    public StringPair(String left, String right) {
        super(left, right);
    }

    public static void main(String[] args) {
        StringPair stringOfInt = new StringPair("1","2");
        StringPair stringOfName = new StringPair("Elena","Egor");
        System.out.println(stringOfInt.isLeftGreaterThanRight());
        System.out.println(stringOfName.isLeftGreaterThanRight());
    }
}
