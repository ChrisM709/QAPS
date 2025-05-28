package com.classicgamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testCartTotal() {
        Cart cart = new Cart();
        cart.addGame(new Game("Test Game 1", "NES", "Test", 5, 10.00));
        cart.addGame(new Game("Test Game 2", "SNES", "Test", 5, 15.00));

        assertEquals(25.00, cart.getTotalPrice(), 0.001);
    }
}
