public class Card {

    private final Rank RANK;
    private final Suit SUIT;

    public enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

        private int value;

        Rank(int value) {
            this.value = value;
        }
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    public Card(Rank RANK, Suit SUIT) {
        this.RANK = RANK;
        this.SUIT = SUIT;
    }

    @Override
    public String toString() {
        return "Card{" +
                "RANK=" + RANK +
                ", SUIT=" + SUIT +
                '}';
    }
}
