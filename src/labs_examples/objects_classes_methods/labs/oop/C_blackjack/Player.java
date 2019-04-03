package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;
    private int currentBet;

    public Player(String name) {
        this.name = name;
        this.potValue = 100;
        this.currentBet = 0;
        this.hand = new Hand();
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void clearHands(){
        this.hand = new Hand();
    }

    public boolean computerWantsCard(){
        if (hand.getHandValue() < 16 ) {
            return true;
        }
        return false;
    }


}
