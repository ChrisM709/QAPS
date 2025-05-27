package com.classicgamestore;

public class PurchaseGame {

    public boolean processPurchase(Cart userCart) {
        if (userCart.getItems().isEmpty()) {
            System.out.println("Purchase Failed: Your cart is empty! Please add an item to your cart.");
            return false;
        }

        for (Game selectedGame : userCart.getItems()) {
            if (selectedGame.getStock() <= 0) {
                System.out.println("Purchase Failed: " + selectedGame.getTitle() + " is out of stock.");
                return false;
            }
        }

        for (Game selectedGame : userCart.getItems()) {
            selectedGame.reduceStockByOne();
        }

        userCart.clearCart();

        System.out.println("Purchase Successful!");
        return true;
    }
}
