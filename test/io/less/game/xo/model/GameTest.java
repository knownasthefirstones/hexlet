package io.less.game.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void getPlayers() throws Exception {
        final Figure inputFigure = Figure.X;
        final Player[] inputPlayer = new Player[1];
        final Game game = new Game(inputPlayer, null, null);
        final Player[] returnPlayer = game.getPlayers();

        assertEquals(inputPlayer, returnPlayer);
    }

    @Test
    void getField() throws Exception {
        final Field field = new Field();
        final Game game = new Game(null, field, null);

    }

    @Test
    void getGameName() throws Exception {
        final String inputGameName = "A";
        final Game game = new Game(null, null, inputGameName);
        final String returnGameName = game.getGameName();

        assertEquals(inputGameName, returnGameName);
    }
}