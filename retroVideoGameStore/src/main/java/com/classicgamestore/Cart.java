package com.classicgamestore;

import java.util.ArrayList;
import java.util.List;

/**
 * handles the logic for the user's shopping cart
 * including adding, removing, and clearing games.
 */
public class Cart {
    private List<Game> items;

    /**
     * creates an empty shopping cart.
     */
    public Cart() {
        items = new ArrayList<>();
    }

    /**
     * adds a game to the user's cart.
     *
     * @param selectedGame the game to be added
     */
    public void addGame(Game selectedGame) {
        items.add(selectedGame);
    }

    /**
     * removes a game from the user's cart.
     *
     * @param gameRemoved the game to be removed
     * @return true if the game was removed, false if not in cart
     */
    public boolean removeGame(Game gameRemoved) {
        return items.remove(gameRemoved);
    }

    /**
     * gets all games currently in the cart.
     *
     * @return a list of games
     */
    public List<Game> getItems() {
        return items;
    }

    /**
     * calculates the total price of all games in the cart.
     *
     * @return the total cost as a double
     */
    public double getTotalPrice() {
        double total = 0;
        for (Game cartItem : items) {
            total += cartItem.getPrice();
        }
        return total;
    }

    /**
     * clears all items from the cart.
     */
    public void clearCart() {
        items.clear();
    }
}
