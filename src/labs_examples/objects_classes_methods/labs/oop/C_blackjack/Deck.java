package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    public static Card[] cards;
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
            System.out.println(cards[i].suit[0]);
        }
    }

    public static void main(String[] args) {
        cards = new Card[52];
        for (int i = 0; i < cards.length;i++){
            System.out.println(cards[i].suit[0]);
        }
    }
}
