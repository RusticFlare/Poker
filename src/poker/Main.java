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
        Card[] hand = {queenClubs, aceSpades, sevenHearts, sevenDiamonds, twoClubs};
        System.out.println(Arrays.toString(hand));
        Arrays.sort(hand);
        System.out.println(Arrays.toString(hand));
    }
}
