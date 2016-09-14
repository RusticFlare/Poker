package poker;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by j_d_b on 27/08/2016.
 */
public class Hand {

    private Card[] cards;
    private Map<Value, Integer> valueCount;
    private Map<Suit, Integer> suitCount;

    public Hand(Card c0, Card c1, Card c2, Card c3, Card c4, Card c5, Card c6) {
        cards = new Card[7];
        cards[0] = c0;
        cards[1] = c1;
        cards[2] = c2;
        cards[3] = c3;
        cards[4] = c4;
        cards[5] = c5;
        cards[6] = c6;
        Arrays.sort(cards);

        // Initate value and suit counts
        valueCount = new HashMap<Value, Integer>();
        Value[] values = Value.values();
        for(Value value : values) {
            valueCount.put(value, 0);
        }
        suitCount = new HashMap<Suit, Integer>();
        Suit[] suits = Suit.values();
        for(Suit suit : suits) {
            suitCount.put(suit, 0);
        }

        for(Card card : cards) {
            valueCount.put(card.getValue(), valueCount.get(card.getValue()) + 1);
            suitCount.put(card.getSuit(), suitCount.get(card.getSuit()) + 1);
        }
    }

    public int getValueCount(Value v) {
        return valueCount.get(v);
    }

    public int getSuitCount(Suit s) {
        return suitCount.get(s);
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }

    public int straightFlushValue() {
        int straightFlushLength = 1;
        for(int x = 0; x+1 < cards.length; x++) {
            if(cards[x].getNumber() + 1 == cards[x+1].getNumber() && cards[x+1].getValue() != Value.TWO) {
                straightFlushLength++;
            } else {
                straightFlushLength = 1;
            }
            if(straightFlushLength == 5) {
                return Value.valueToNumber(cards[x+1].getValue());
            }
        }
        return -1;
    }

    // This is the value of the 4 of a kind plus the value of the kicker
    public int fourOfAKindValue() {
        Value[] values = Value.values();
        for(Value value : values) {
            if(valueCount.get(value) == 4) {
                int fourOfAKindNumber = Value.valueToNumber(value);
                int kickerNumber = 0;
                for(Value v : values) {
                    int vCount = valueCount.get(v);
                    if(0 < vCount && vCount < 4) {
                        kickerNumber = Value.valueToNumber(v);
                    }
                }
                return (13 * fourOfAKindNumber) + kickerNumber;
            }
        }
        return -1;
    }

    public int straightValue() {
        int straightLength = 0;
        Value[] values = Value.values();
        for(Value value : values) {
            if(valueCount.get(value) > 0) {
                straightLength++;
                if(straightLength == 5) {
                    return Value.valueToNumber(value);
                }
            } else {
                straightLength = 0;
            }
        }
        return -1;
    }

    public int flushValue() {
        Suit[] suits = Suit.values();
        for(Suit suit : suits) {
            if(suitCount.get(suit) >= 5) {
                int flushValue = 0;
                int cardsInFlushRemaining = suitCount.get(suit);
                for(Card c : cards) {
                    if(c.getSuit() == suit) {
                        if(cardsInFlushRemaining <= 5) {
                            int cardValue = Value.valueToNumber(c.getValue());
                            int signifcance = 5 - cardsInFlushRemaining; // The first card in the flush is the least significant
                            flushValue += Math.pow(13,signifcance) * cardValue;
                        }
                        cardsInFlushRemaining--;
                    }
                }
                return flushValue;
            }
        }
        return -1;
    }

    // This is the value of the 4 of a kind plus the value of the kicker
    public int threeOfAKindValue() {
        Value[] values = Value.values();
        for(Value value : values) {
            if(valueCount.get(value) == 3) {
                int threeOfAKindNumber = Value.valueToNumber(value);
                int kickerNumber1 = 0;
                int kickerNumber2 = 0;
                for(Value v : values) {
                    int vCount = valueCount.get(v);
                    if(vCount == 1) {
                        kickerNumber2 = kickerNumber1;
                        kickerNumber1 = Value.valueToNumber(v);
                    }
                }
                return (13 * 13 * threeOfAKindNumber) + (13 * kickerNumber1) + kickerNumber2;
            }
        }
        return -1;
    }
}
