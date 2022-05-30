package by.it_academy.lesson3;
/**
 * Создать переменную giftValue.
 * Напечатать сумму налога, в соответствие с таблицей на картинке.
 * При сумме ниже 5000 - налог равен 0.
 * Например: подарок 6000 требует 180 налога (100 + (6000-5000)
 */
public class Task1 {
    public static void main(String[] args) {
        int giftValue = 6000;
        if (giftValue >= 25000) {
            System.out.println(1700 + (giftValue - 25000) * 0.1);
        } else if (giftValue >= 5000) {
            System.out.println(100 + (giftValue - 5000) * 0.08);
        } else if (giftValue >= 0) {
            System.out.println(0);
        } else {
            System.out.println("Incorrect value");
        }
    }
}
