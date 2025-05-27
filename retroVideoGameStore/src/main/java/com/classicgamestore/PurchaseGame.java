package com.classicgamestore;

public class PurchaseGame {

    /**
     * takes care of the logic for all items in the user's cart for purchase.
     * 
     * @param userCart cart containing selected games
     * @return true if purchase was successful, false if failed
     */
    public boolean processPurchase(Cart userCart) {
        // need to check if the cart is empty when trying to purchase
        if (userCart.getItems().isEmpty()) {
            System.out.println("Purchase Failed: Your cart is empty! Please add an item to your cart.");
            return false;
        }

        // check to make sure if a game is out of stock
        for (Game selectedGame : userCart.getItems()) {
            if (selectedGame.getStock() <= 0) {
                System.out.println("Purchase Failed: " + selectedGame.getTitle() + " is out of stock.");
                return false;
            }
        }

        // reduce the stock for each game purchased
        for (Game selectedGame : userCart.getItems()) {
            selectedGame.reduceStockByOne();
        }

        // used to clear the cart after purchase
        userCart.clearCart();

        // confirmation of purchase
        System.out.println("Purchase Successful!");
        return true;
    }
}
