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
        Card c0 = new Card(Value.QUEEN, Suit.CLUBS);
        Card c1 = new Card(Value.ACE, Suit.SPADES);
        Card c2 = new Card(Value.SEVEN, Suit.HEARTS);
        Card c3 = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card c4 = new Card(Value.TWO, Suit.CLUBS);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.TWO, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(-1, hand.straightFlushValue());
    }

    @Test
    public void shouldHaveStraightFlushValueMinusOne2() {
        Card c0 = new Card(Value.QUEEN, Suit.CLUBS);
        Card c1 = new Card(Value.ACE, Suit.CLUBS);
        Card c2 = new Card(Value.KING, Suit.CLUBS);
        Card c3 = new Card(Value.TWO, Suit.HEARTS);
        Card c4 = new Card(Value.JACK, Suit.CLUBS);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.TEN, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(-1, hand.straightFlushValue());
    }

    @Test
    public void shouldHaveStraightFlushValue12() {
        Card c0 = new Card(Value.QUEEN, Suit.SPADES);
        Card c1 = new Card(Value.ACE, Suit.SPADES);
        Card c2 = new Card(Value.KING, Suit.SPADES);
        Card c3 = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card c4 = new Card(Value.JACK, Suit.SPADES);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.TEN, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(12, hand.straightFlushValue());
    }

    @Test
    public void shouldHaveFourOfAKindValueMinusOne() {
        Card c0 = new Card(Value.QUEEN, Suit.CLUBS);
        Card c1 = new Card(Value.ACE, Suit.SPADES);
        Card c2 = new Card(Value.SEVEN, Suit.HEARTS);
        Card c3 = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card c4 = new Card(Value.TWO, Suit.CLUBS);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.TWO, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(-1, hand.fourOfAKindValue());
    }

    @Test
    public void shouldHaveFourOfAKindValue12() {
        Card c0 = new Card(Value.TWO, Suit.SPADES);
        Card c1 = new Card(Value.ACE, Suit.SPADES);
        Card c2 = new Card(Value.TWO, Suit.HEARTS);
        Card c3 = new Card(Value.TWO, Suit.DIAMONDS);
        Card c4 = new Card(Value.JACK, Suit.SPADES);
        Card c5 = new Card(Value.TWO, Suit.CLUBS);
        Card c6 = new Card(Value.TEN, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(12, hand.fourOfAKindValue());
    }

    @Test
    public void shouldHaveStraightValueMinusOne() {
        Card c0 = new Card(Value.QUEEN, Suit.CLUBS);
        Card c1 = new Card(Value.ACE, Suit.SPADES);
        Card c2 = new Card(Value.SEVEN, Suit.HEARTS);
        Card c3 = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card c4 = new Card(Value.TWO, Suit.CLUBS);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.TWO, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(-1, hand.straightValue());
    }

    @Test
    public void shouldHaveStraightValue10() {
        Card c0 = new Card(Value.JACK, Suit.CLUBS);
        Card c1 = new Card(Value.EIGHT, Suit.SPADES);
        Card c2 = new Card(Value.SEVEN, Suit.HEARTS);
        Card c3 = new Card(Value.SEVEN, Suit.DIAMONDS);
        Card c4 = new Card(Value.TEN, Suit.CLUBS);
        Card c5 = new Card(Value.THREE, Suit.CLUBS);
        Card c6 = new Card(Value.NINE, Suit.SPADES);
        Hand hand = new Hand(c0, c1, c2, c3, c4, c5, c6);
        assertEquals(9, hand.straightValue());
    }

}