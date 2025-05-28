package com.classicgamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    void testGameProperties() {
        Game game = new Game("Metroid", "NES", "Sci-fi platformer", 3, 29.99);

        assertEquals("Metroid", game.getTitle());
        assertEquals("NES", game.getPlatform());
        assertEquals("Sci-fi platformer", game.getDescription());
        assertEquals(3, game.getStock());
        assertEquals(29.99, game.getPrice(), 0.001);
    }
}
