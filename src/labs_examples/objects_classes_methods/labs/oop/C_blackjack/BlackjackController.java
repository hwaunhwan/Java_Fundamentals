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
        boolean playerContinue = true;
        boolean dealerContinue = true;

        // Deal two cards to each player
        deck.dealCard(player);
        deck.dealCard(dealer);
        deck.dealCard(player);
        deck.dealCard(dealer);

        printPlayerHand(player);

        System.out.println("\nDealer's Hands: ");
        dealer.getHand().showFirstCards();

        // Ask user / dealer if they want
        // until both says no or both bust
        do {
            if (playerContinue && wantsCard(player)) {
                deck.dealCard(player);
                printPlayerHand(player);
            } else {
                playerContinue = false;
            }

            if (dealerContinue && wantsCard(dealer)) {
                deck.dealCard(dealer);
                System.out.println("Dealer took another card");
            } else {
                dealerContinue = false;
                System.out.println("Dealer didn't take another card");
            }

        } while (playerContinue || dealerContinue);

        determineWinner(player, dealer);

    }

    private static void determineWinner(Player player, Player dealer) {

        if (player.getHand().isGreaterThan21() && dealer.getHand().isGreaterThan21()){
            System.out.println("Both bust");
        } else if (player.getHand().isGreaterThan21() && dealer.getHand().isLessThan21()){
            System.out.println("Player bust, Dealer wins");
        } else if (player.getHand().isLessThan21() && dealer.getHand().isGreaterThan21()){
            System.out.println("Dealer bust, Player wins");
        } else {
            if(player.getHand().getHandValue() > dealer.getHand().getHandValue()){
                System.out.println("Player wins");
            } else {
                System.out.println("Dealer wins");
            }
        }

        printPlayerHand(player);
        printPlayerHand(dealer);
    }

    private static boolean wantsCard(Player player) {

        if(player.getName().equalsIgnoreCase("Dealer")){
            return player.computerWantsCard();
        }

        if(player.getHand().isGreaterThan21()){
            System.out.println("You busted");
            return false;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like another card? (Y/N)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    private static void printPlayerHand(Player player){
        // Show two cards of the player and one card of the dealer
        System.out.println(player.getName() + "'s Hands: ");
        player.getHand().showAllCards();
        System.out.println();
        System.out.println(player.getName() + "'s Current Score: " + player.getHand().getHandValue());
    }


}
