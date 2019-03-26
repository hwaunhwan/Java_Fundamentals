package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private int cardValue;
    private char cardSuit;

    public Card(int suitIndex, int cardValue) {
        this.cardSuit = this.suit[suitIndex];
        this.cardValue = cardValue;
    }

    public Card(){}

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                ", cardValue=" + cardValue +
                ", cardSuit=" + cardSuit +
                '}';
    }
}
