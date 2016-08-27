package poker;

/**
 * Created by j_d_b on 27/08/2016.
 */
public class Card implements Comparable<Card> {

    private Value value;
    private Suit suit;

    public Card(Value v, Suit s) {
        value = v;
        suit = s;
    }

    @Override
    public int compareTo(Card o) {
        int valueCompare = this.value.compareTo(o.value);
        int suitCompare = this.suit.compareTo(o.suit);
        if (valueCompare != 0) {
            return valueCompare;
        } else {
            return suitCompare;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit=" + suit +
                '}';
    }
}
