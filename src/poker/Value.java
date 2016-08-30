package poker;

/**
 * Created by j_d_b on 27/08/2016.
 */
public enum Value {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    public static int valueToNumber(Value value) {
        switch (value) {
            case TWO:   return 0;
            case THREE: return 1;
            case FOUR:  return 2;
            case FIVE:  return 3;
            case SIX:   return 4;
            case SEVEN: return 5;
            case EIGHT: return 6;
            case NINE:  return 7;
            case TEN:   return 8;
            case JACK:  return 9;
            case QUEEN: return 10;
            case KING:  return 11;
            case ACE:   return 12;
            default:    return -1;
        }
    }
}
