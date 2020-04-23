package learning.module35_override.view;

import learning.module35_override.controller.Game;

public class ConsoleView {

    final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getGameName());
    }

    public void showPlayersName() {
        System.out.println(game.getPlayers());
    }

}
