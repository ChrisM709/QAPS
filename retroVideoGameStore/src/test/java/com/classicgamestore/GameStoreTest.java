package com.classicgamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {

    @Test
    void testCartTotal() {
        Cart cart = new Cart();
        cart.addGame(new Game("Test Game 1", "NES", "Test", 5, 10.00));
        cart.addGame(new Game("Test Game 2", "SNES", "Test", 5, 15.00));

        assertEquals(25.00, cart.getTotalPrice(), 0.001);
    }

    @Test
    void testEmptyCartFailsPurchase() {
        Cart cart = new Cart();
        PurchaseGame purchaseHandler = new PurchaseGame();

        boolean result = purchaseHandler.processPurchase(cart);
        assertFalse(result);
    }

    @Test
    void testStockReducesAfterPurchase() {
        Game game = new Game("Test Game", "NES", "Test", 2, 20.00);
        Cart cart = new Cart();
        cart.addGame(game);

        PurchaseGame purchaseHandler = new PurchaseGame();
        boolean result = purchaseHandler.processPurchase(cart);

        assertTrue(result);
        assertEquals(1, game.getStock());
    }

}
