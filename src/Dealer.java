public class Dealer {

    private Deck deck;

    public Dealer() {
        this.deck = new Deck();
    }

    public void receiveCard(Player player) {
        player.setHand(this.deck.dealCard());
    }
}
