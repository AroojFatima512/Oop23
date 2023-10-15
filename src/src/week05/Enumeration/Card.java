package week05.Enumeration;

import java.util.Random;

public class Card {

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    static class Deck {
        private static final int DECK_SIZE = 52;
        private final Card[] cards;
        private int topCardIndex;

        public Deck() {
            cards = new Card[DECK_SIZE];
            initializeDeck();
            shuffle();
        }

        private void initializeDeck() {
            int index = 0;
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    cards[index++] = new Card(suit, rank);
                }
            }
        }

        public void shuffle() {
            Random rand = new Random();
            for (int i = DECK_SIZE - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                Card temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
            topCardIndex = 0;
        }

        public Card dealCard() {

            return topCardIndex < DECK_SIZE ? cards[topCardIndex++] : null;
        }
}
}
