package poker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Card queenClubs = new Card(Value.QUEEN, Suit.CLUBS);
        Card aceSpades = new Card(Value.ACE, Suit.SPADES);
        Card sevenHearts = new Card(Value.SEVEN, Suit.HEARTS);
        Card sevenDiamonds = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card twoClubs = new Card(Value.TWO, Suit.CLUBS);
        Card threeClubs = new Card(Value.THREE, Suit.CLUBS);
        Card twoSpades = new Card(Value.TWO, Suit.SPADES);
        Hand hand = new Hand(queenClubs, aceSpades, sevenHearts, sevenDiamonds, twoClubs, threeClubs, twoSpades);
        System.out.println(hand.toString());
        Value[] values = Value.values();
        for(Value value : values) {
            System.out.println(value + " " + hand.getValueCount(value));
        }
        System.out.println();
        Suit[] suits = Suit.values();
        for(Suit suit : suits) {
            System.out.println(suit  + " " + hand.getSuitCount(suit));
        }
    }
}
