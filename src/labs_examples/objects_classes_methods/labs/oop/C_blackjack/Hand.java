package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getHandValue() {
        int value = 0;
        for (Card c : cards) {
            value += c.getCardValue();
        }
        return value;
    }

    public boolean isGreaterThan21() {
        if(getHandValue() > 21){
            return true;
        }
        return false;
    }

}
