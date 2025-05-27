package com.classicgamestore;

import java.util.List;

public class GameStoreApp {
    public static void main(String[] args) {
        List<Game> games = List.of(
                new Game("Super Mario Bros", "NES", "Classic platformer that defined the genre.", 12, 29.99),
                new Game("The Legend of Zelda", "NES", "Top-down adventure with dungeons and secrets.", 5, 39.99),
                new Game("Sonic the Hedgehog", "Genesis", "Fast-paced side-scroller with iconic speed.", 8, 24.99),
                new Game("Street Fighter II", "SNES", "Legendary fighting game with diverse characters.", 10, 34.99),
                new Game("Tetris", "Game Boy", "Addictive puzzle game with falling blocks.", 15, 19.99),
                new Game("Metroid", "NES", "Explore alien worlds in this atmospheric shooter.", 6, 31.99),
                new Game("Donkey Kong Country", "SNES", "Groundbreaking visuals in a jungle platformer.", 7, 27.99),
                new Game("Final Fantasy VI", "SNES", "Epic JRPG with deep storytelling and characters.", 4, 44.99),
                new Game("Mega Man X", "SNES", "Run-and-gun action with slick futuristic levels.", 9, 26.99),
                new Game("Castlevania: Symphony of the Night", "PlayStation","Explore Dracula's castle in this cult classic.", 3, 42.50)
        );

        // hardcoded process to test functions of the program
        Cart userCart = new Cart();
        PurchaseGame purchaseHandler = new PurchaseGame();

        userCart.addGame(games.get(0));
        userCart.addGame(games.get(1)); 

        // used to display all games in the cart
        System.out.println("Your Cart:");
        for (Game cartItem : userCart.getItems()) {
            System.out.println("- " + cartItem.getTitle() + " ($" + cartItem.getPrice() + ")");
        }
        System.out.println("Total: $" + userCart.getTotalPrice());

        // process the payment
        System.out.println("\nProcessing Purchase...");
        boolean success = purchaseHandler.processPurchase(userCart);

        // if the payment goes through the stock gets updated
        if (success) {
            System.out.println("\nUpdated Stock:");
            System.out.println(games.get(0).getTitle() + " - Remaining: " + games.get(0).getStock());
            System.out.println(games.get(1).getTitle() + " - Remaining: " + games.get(1).getStock());
        }
    }
}
