package poker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import poker.Card;
import poker.Hand;
import poker.Suit;
import poker.Value;

/**
 * Created by j_d_b on 05/09/2016.
 */
public class PokerTests {

    @Test
    public void shouldHaveStraightFlushValueMinusOne() {
        Card queenClubs = new Card(Value.QUEEN, Suit.CLUBS);
        Card aceSpades = new Card(Value.ACE, Suit.SPADES);
        Card sevenHearts = new Card(Value.SEVEN, Suit.HEARTS);
        Card sevenDiamonds = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card twoClubs = new Card(Value.TWO, Suit.CLUBS);
        Card threeClubs = new Card(Value.THREE, Suit.CLUBS);
        Card twoSpades = new Card(Value.TWO, Suit.SPADES);
        Hand hand = new Hand(queenClubs, aceSpades, sevenHearts, sevenDiamonds, twoClubs, threeClubs, twoSpades);
        assertEquals(-1, hand.straightFlushValue());
    }

}