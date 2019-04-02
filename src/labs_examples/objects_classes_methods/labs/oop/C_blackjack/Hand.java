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

    public void showAllCards(){
        for(Card c : cards){
            System.out.print(c.getCardName() + " of " + c.getCardSuit() + " | ");
        }
    }

    public void showFirstCards(){
        System.out.println(cards.get(0).getCardName() + " of " + cards.get(0).getCardSuit());
        System.out.println("Second card face down");
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

    public boolean isLessThan21() {
        if(getHandValue() < 21){
            return true;
        }
        return false;
    }

}
