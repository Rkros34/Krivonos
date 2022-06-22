package by.it_academy.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать класс Card - игральная карта, который содержит поля:
 * стоимость (1-14) и масть.
 * Переопределить у него метод String toString(), чтобы возвращалась строка вида 'CLUB 10'.
 * При этом вместо стоимости 11 должно быть J, 12 - Q, 13 - K, 14 -A, например 'HEART A'.
 */
public class Card implements Comparable<Card> {
    private final Suit suit;
    private int cardValue;
    String cardValueStr = String.valueOf(cardValue);

    private Card(Suit suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        switch (cardValue) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                cardValueStr = String.valueOf(cardValue);
                break;
            case 11:
                cardValueStr = "J";
                break;
            case 12:
                cardValueStr = "Q";
                break;
            case 13:
                cardValueStr = "K";
                break;
            case 14:
                cardValueStr = "A";
                break;
            default:
                break;
        }
        return suit + " " + cardValueStr;
    }

    public static void main(String[] args) {

        Card card1 = new Card(Suit.CLUB, 12);
        Card card2 = new Card(Suit.DIAMOND, 2);
        Card card3 = new Card(Suit.HEART, 14);
        Card card4 = new Card(Suit.SPADE, 4);
        Card card5 = new Card(Suit.DIAMOND, 12);
        Card[] arrayCards = new Card[]{card1, card2, card3, card4, card5};

        boolean sorted;
        do {
            sorted = false;
            for (int i = 0; i < arrayCards.length - 1; i++) {
                if (arrayCards[i].compareTo(arrayCards[i + 1]) > 0) {
                    sorted = false;
                    Card temp = arrayCards[i];
                    arrayCards[i] = arrayCards[i + 1];
                    arrayCards[i + 1] = temp;
                }
            }
        }
        while (sorted) ;
        Arrays.sort(arrayCards);
        for (Card s : arrayCards) {
            System.out.println(s);
        }
    }


    @Override
    public int compareTo(Card o) {
        int result = this.suit.compareTo(o.suit);
        if (result == 0) {
            if (cardValue <= o.cardValue) {
                result = -1;
            } else if (cardValue >= o.cardValue) {
                result = 1;
            } else {
                result = 0;
            }
        }
        return result;
    }
}


