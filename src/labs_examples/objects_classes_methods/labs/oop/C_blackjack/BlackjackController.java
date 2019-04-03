package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackJack();
    }

    private static void playBlackJack() {

        Scanner scanner = new Scanner(System.in);
        String playerName;
        Player player;
        Player dealer;
        Deck deck = new Deck();
        boolean playAnotherGame = true;
        boolean playerContinue;
        boolean dealerContinue;
        boolean anyoneBroke;

        boolean continueBet;
        int bet = 0;
        int currentTotalBet = 0;

        while (playAnotherGame) {

            System.out.println("Welcome, what's your name?");
            playerName = scanner.next();
            player = new Player(playerName);
            dealer = new Player("Dealer");
            playerContinue = true;
            dealerContinue = true;
            continueBet = true;
            anyoneBroke = false;

            while(!(anyoneBroke)){
                // Deal two cards to each player
                deck.shuffle();
                player.clearHands();
                dealer.clearHands();
                playerContinue = true;
                dealerContinue = true;
                continueBet = true;

                deck.dealCard(player);
                deck.dealCard(dealer);
                deck.dealCard(player);
                deck.dealCard(dealer);

                printPlayerHand(player);
                printPotValue(player);


                System.out.println("\nDealer's Hands: ");
                dealer.getHand().showFirstCards();
                printPotValue(dealer);


                do {
                    try {
                        System.out.println("\nHow much do you want to bet?");
                        bet = scanner.nextInt();
                        if (bet > player.getPotValue()) {
                            System.out.println("You can't bet more than your pot");
                            System.out.println("How much do you want to bet?");
                            bet = scanner.nextInt();
                        } else if (bet > dealer.getPotValue()) {
                            System.out.println("You can't bet more than dealer's pot");
                            System.out.println("How much do you want to bet?");
                            bet = scanner.nextInt();
                        }

                        continueBet = false;
                    } catch (InputMismatchException ex) {
                        System.out.println("Try again. (" +
                                "Incorrect input: an integer is required)");
                        scanner.nextLine();
                    }
                }
                while (continueBet);

                do {
                    if (playerContinue && wantsCard(player)) {
                        deck.dealCard(player);
                        printPlayerHand(player);
                        showBetSize(bet * 2);
                    } else {
                        playerContinue = false;
                    }

                    if (dealerContinue && wantsCard(dealer)) {
                        deck.dealCard(dealer);
                        System.out.println("\nDealer took another card");
                    } else {
                        dealerContinue = false;
                        System.out.println("\nDealer didn't take another card");
                    }

                } while (playerContinue || dealerContinue);
                determineWinner(player, dealer, bet);
                anyoneBroke = checkPot(player, dealer);
            }
            finalWinner(player, dealer);
            System.out.println("Game over");
            System.out.println("\nWould you like to play another game? (Y/N)");
            String newResponse = scanner.next();
            if(newResponse.equalsIgnoreCase("y")){
                playAnotherGame = true;
            } else {
                playAnotherGame = false;
                System.out.println("Thank you for playing!");
            }
        }
    }

    private static void finalWinner(Player player, Player dealer) {
        if (player.getPotValue() > dealer.getPotValue()){
            System.out.println(dealer.getName() + " is broke! " + player.getName() + " won!");
        } else {
            System.out.println(player.getName() + " is broke! " + dealer.getName() + " won!");
        }
    }

    private static boolean checkPot(Player player, Player dealer) {
        if (player.getPotValue() == 0 || dealer.getPotValue() == 0){
            return true;
        }
        return false;
    }

    private static void showBetSize(int currentTotalBet) {
        System.out.println("\nCurrent Bet Size: $" + currentTotalBet);
    }

    private static void handleBet(Player player, int bet) {
        player.setPotValue(player.getPotValue() + bet);
    }

    private static void determineWinner(Player player, Player dealer, int currentTotalBet) {

        printPlayerFinalScore(player, dealer);

        if (player.getHand().isGreaterThan21() && dealer.getHand().isGreaterThan21()){
            System.out.println("Both bust");

        } else if (player.getHand().isGreaterThan21() && dealer.getHand().isLessThan21()){
            System.out.println("Player bust, Dealer wins");
            handleBet(player, (currentTotalBet * -1));
            handleBet(dealer, currentTotalBet);
        } else if (player.getHand().isLessThan21() && dealer.getHand().isGreaterThan21()){
            System.out.println("Dealer bust, Player wins");
            handleBet(player, currentTotalBet);
            handleBet(dealer, (currentTotalBet * -1));
        } else {
            if(player.getHand().getHandValue() > dealer.getHand().getHandValue()){
                System.out.println("Player wins");
                handleBet(player, currentTotalBet);
                handleBet(dealer, (currentTotalBet * -1));
            } else if (player.getHand().getHandValue() == dealer.getHand().getHandValue()) {
                System.out.println("It's a tie");
            } else {
                System.out.println("Dealer wins");
                handleBet(player, (currentTotalBet * -1));
                handleBet(dealer, currentTotalBet);
            }
        }
        System.out.println();
        printPotValue(player);
        printPotValue(dealer);


    }

    private static void printPlayerFinalScore(Player player, Player dealer) {

        System.out.println(player.getName() + "'s Final Hands: ");
        player.getHand().showAllCards();
        System.out.println("\n" + dealer.getName() + "'s Final Hands: ");
        dealer.getHand().showAllCards();
        System.out.println("\n" + player.getName() + "'s Final Score: " + player.getHand().getHandValue() +" vs. " +
                dealer.getName() + "'s Final Score: " + dealer.getHand().getHandValue());

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

    private static void printPotValue(Player player){
        System.out.println(player.getName() + "'s Pot: $"+player.getPotValue());
    }


}
