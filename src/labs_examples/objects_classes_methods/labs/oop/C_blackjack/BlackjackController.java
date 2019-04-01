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

        // Deal two cards to each player
        deck.dealCard(player);
        deck.dealCard(dealer);
        deck.dealCard(player);
        deck.dealCard(dealer);

        // Show two cards of the player and one card of the dealer
        System.out.println(playerName + "'s Hands: ");
        player.getHand().showAllCards();
        System.out.println();
        System.out.println(playerName + "'s Current Score: " + player.getHand().getHandValue());

        System.out.println("\nDealer's Hands: ");
        dealer.getHand().showFirstCards();

        // Check if the player hit blackjack with first two cards
        if (player.getHand().getHandValue() == 21) {
            if (dealer.getHand().getHandValue() == 21) {
                System.out.println("Blackjack! You both won!");
            } else {
                System.out.println("Blackjack! " + playerName + " won!");
            }
        } else if (dealer.getHand().getHandValue() == 21){
            System.out.println(playerName + " lost! The dealer hit Blackjack!");
        } else {
            // When both players have cards value below 21
            String anotherCard = "y";
            while (player.getHand().getHandValue() < 21 && anotherCard.equalsIgnoreCase("y")) {
                do {
                    System.out.println("\nWould you like to receive another card? (Y/N)");
                    anotherCard = scanner.next();
                } while (!(anotherCard.equalsIgnoreCase("y") ||
                        anotherCard.equalsIgnoreCase("n")));

                // Player doesn't want anymore card
                if (anotherCard.equalsIgnoreCase("n")) {
                    System.out.println();
                    System.out.println(playerName + "'s Final Score: " + player.getHand().getHandValue());

                } else {
                    deck.dealCard(player);
                    System.out.println(playerName + "'s Current Hands: ");
                    player.getHand().showAllCards();
                    System.out.println();
                    System.out.println(playerName + "'s Current Score: " + player.getHand().getHandValue());
                }

                while (dealer.computerWantsCard()) {
                    deck.dealCard(dealer);
                    System.out.println("\nDealer took another card");
                }
                System.out.println("\nDealer did not take another card");
                System.out.println("Dealer's Final Score: " + dealer.getHand().getHandValue());
            }

            if (player.getHand().getHandValue() > 21) {
                System.out.println(playerName + " lost!");
            }
            if (dealer.getHand().getHandValue() > 21) {
                System.out.println("Dealer lost!");
            }
            if (player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
                System.out.println(playerName + " won!");
            } else if (player.getHand().getHandValue() == dealer.getHand().getHandValue()){
                System.out.println("Tie game!");
            } else {
                System.out.println("Dealer won!");
            }
        }
    }
}
