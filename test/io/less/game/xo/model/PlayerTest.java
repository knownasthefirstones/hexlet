package io.less.game.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() throws Exception {
        final String inputValue = "A";
        final Player player = new Player(inputValue, null);
        final String returnValue = player.getName();

        assertEquals(inputValue, returnValue);
    }

    @Test
    void getNameTrue() throws Exception {
        final String inputValue = "A";
        final String expectedValue = "A";
        final Player player = new Player(inputValue, null);
        final String returnValue = player.getName();

        assertEquals(expectedValue, returnValue);
    }

    @Test
    void getFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = Figure.X;
        final Player player = new Player(null, inputValue);
        final Figure returnValue = player.getFigure();

        assertEquals(expectedValue, returnValue);
    }
}