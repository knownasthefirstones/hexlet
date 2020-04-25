package io.less.game.xo;

import io.less.game.xo.model.Field;
import io.less.game.xo.model.Figure;
import io.less.game.xo.model.Game;
import io.less.game.xo.model.Player;
import io.less.game.xo.view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        final String name1 = "A";
        final String name2 = "B";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");
        final ConsoleView consoleView = new ConsoleView();

        while (ConsoleView.move(gameXO)) { // возвращает только в том случае, если следующий ход возможен
            consoleView.show(gameXO);
        }
    }
}
