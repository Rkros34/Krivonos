package by.it_academy.lesson6;

/**
 * Создать класс PaymentCard с полем double balance - баланс на карте.
 * Создать конструктор, который принимает начальный баланс и сохраняет его в поле balance.
 * Переопределить метод String toString(), который будет возвращать строку
 * 'The card has a balance of X', где Х = балансу карты.
 * Создать методы:
 * void eatAffordably() - вычитает из баланса 2.6;
 * void eatHeartily() - вычитает из баланса 4.6.
 * При этом эти методы не должны вычитать, если конечная сумма будет ниже 0.
 * Создать метод void addMoney(double amount) - добавить сумму к балансу.
 * При это, если в метод передадут отрицательное число - баланс не должен измениться в этом случае.
 * В main методе протестировать методы PaymentCard.
 */
public class PaymentCard {
    double balance;

    //Конструктор для класса PaymentCard
    public PaymentCard(double startingBalance) {
        this.balance = startingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " BYN";
    }

    double eatAffordably() {
        if (this.balance - 2.6 < 0)
            return balance;
        else {
            this.balance -= 2.6;
            return balance;
        }
    }

    double eatHeartily() {
        if (this.balance - 4.6 < 0)
            return balance;
        else {
            this.balance -= 4.6;
        }
        return balance;
    }

    double addMoney(double amount) {
        if (amount < 0)
            return balance;
        else {
            this.balance = balance + amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        PaymentCard belgazprombank = new PaymentCard(1);
        belgazprombank.eatAffordably();
        System.out.println(belgazprombank.toString());
        belgazprombank.addMoney(3100);
        System.out.println(belgazprombank.toString());
        belgazprombank.eatHeartily();
        System.out.println(belgazprombank.toString());
    }
}
