package com.pluralsight;
import com.pluralsight.models.Deck;
import com.pluralsight.models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        System.out.println("Welcome to BlackJack!");
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        Deck deck = new Deck();
        deck.shuffle();

        // Deal 2 cards to each player
        for (Player player : players) {
            player.getHand().addCard(deck.deal());
            player.getHand().addCard(deck.deal());
        }

        // Display each player's hand
        System.out.println("Player Hands:");
        for (Player player : players) {
            System.out.println(player);
        }

        // Determine the winner
        Player winner = null;
        int highestScore = 0;

        for (Player player : players) {
            int handValue = player.getHandValue();
            if (handValue > highestScore && handValue <= 21) {
                highestScore = handValue;
                winner = player;
            }
        }
        if (winner != null) {
            System.out.println("DrumRoll please...");
            System.out.println("The winner is " + winner.getName() + " with a total of " + highestScore + "!");
        } else {
            System.out.println("No winner!");
        }
        scanner.close();
    }
}