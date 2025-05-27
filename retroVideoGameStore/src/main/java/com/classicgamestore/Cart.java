package com.classicgamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addGame(Game selectedGame) {
        items.add(selectedGame);
    }

    public boolean removeGame(Game gameRemoved) {
        return items.remove(gameRemoved);
    }

    public List<Game> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Game cartItem : items) {
            total += cartItem.getPrice();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }
}