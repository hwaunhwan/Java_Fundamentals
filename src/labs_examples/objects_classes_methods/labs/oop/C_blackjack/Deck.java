package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    public Card[] cards;
    public ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public void createCard(){
        cards = new Card[52];
        for (int i = 0; i < cards.length;i++){
            System.out.println(cards[i].suit);
        }
    }
}
