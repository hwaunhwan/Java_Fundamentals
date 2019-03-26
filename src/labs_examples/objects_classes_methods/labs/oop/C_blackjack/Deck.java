package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    private static Card[] cards;
    private ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Deck() {
    }

    public void createCard(){
        cards = new Card[52];
        int c = 0;
        for (int i = 0; i < 4;i++){
            for(int j = 1; j < 14; j++){
                cards[c] = new Card(i, j);
                c++;
            }

        }
    }

    public static Card[] getCards() {
        return cards;
    }

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.createCard();
        for(int i = 0; i < 52; i++ ){
            System.out.println(myDeck.cards[i].toString());
        }
    }
}
