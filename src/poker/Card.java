package poker;

/**
 * Created by j_d_b on 27/08/2016.
 */
public class Card implements Comparable<Card> {

    private Value value;
    private Suit suit;
    private int number;

    public Card(Value v, Suit s) {
        value = v;
        suit = s;

        number = Value.valueToNumber(v);

        switch (suit) {
            case DIAMONDS:  number += 0;
                break;
            case CLUBS:     number += 13;
                break;
            case HEARTS:    number += 26;
                break;
            case SPADES:    number += 39;
                break;
        }
    }

    @Override
    public int compareTo(Card o) {
        return this.number - o.number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit=" + suit +
                ", number=" + number +
                '}';
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }
}
