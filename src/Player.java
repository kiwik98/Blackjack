public class Player {

    private Hand hand;
    private String name;

    public Player(String name) {
        this.hand = new Hand();
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Card card) {
        this.hand.addCard(card);
    }
}
