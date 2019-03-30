package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackJack();
    }

    private static void playBlackJack() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, what's your name?");
        String playerName = scanner.next();
        Player player = new Player(playerName);
        Player dealer = new Player("Dealer");
        Deck deck = new Deck();
        deck.dealCard(player);
        deck.dealCard(dealer);
        deck.dealCard(player);
        deck.dealCard(dealer);
    }

}
