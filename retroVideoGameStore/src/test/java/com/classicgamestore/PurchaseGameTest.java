package com.classicgamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseGameTest {

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
