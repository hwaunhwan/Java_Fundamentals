package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private static Card[] cards;
    private ArrayList<Integer> usedCards;

    public Deck() {
        populateDeck();
    }

    public void populateDeck(){
        usedCards = new ArrayList<Integer>();
        this.cards = new Card[52];
        int c = 0;
        String x;
        for (int i = 0; i < 4;i++){
            for(int j = 1; j < 14; j++){
                 //x = this.numToString(j);
                cards[c] = new Card(i, j);
                c++;
            }
        }
    }

    public void dealCard(Player player){
        Random r = new Random();
        int x = r.nextInt(52);
        while (usedCards.contains(x)) {
             x = r.nextInt(52);
        }
        usedCards.add(x);
        player.getHand().getCards().add(cards[x]);
    }

    public void shuffle(){
        if (usedCards != null){
            usedCards.clear();
            System.out.println("test");
        }
    }

}
