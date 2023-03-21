import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<>();

    public void addCard (Card newCard) {
        hand.add(newCard);
    }
}
