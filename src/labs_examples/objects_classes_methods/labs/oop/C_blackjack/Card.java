package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private int cardValue;
    private char cardSuit;

    public Card(int suitIndex, int cardValue) {
        this.cardSuit = this.suit[suitIndex];
        this.cardValue = cardValue;
    }

    public Card(){}


    public String getCardName(){
        switch (cardValue) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return Integer.toString(cardValue);
        }
    }

    public char getCardSuit() {
        return cardSuit;
    }

    public int getCardValue(){
        switch (cardValue) {
//            case 1:
//                return 1;
            case 11:
                return 10;
            case 12:
                return 10;
            case 13:
                return 10;
            default:
                return cardValue;
        }
    }

    @Override
    public String toString() {
        return "Card{cardSuit=" + cardSuit +
                ", cardValue=" + cardValue +
                '}';
    }
}
