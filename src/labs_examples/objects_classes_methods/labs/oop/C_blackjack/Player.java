package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public String name;
    public Hand hand;
    public int potValue;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }
}
