import java.util.ArrayList;
import java.util.List;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        for(Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card dealCard() {
        Card card = deck.get(deck.size() - 1);    // last card in the deck
        deck.remove(card);
        return card;
    }
}
