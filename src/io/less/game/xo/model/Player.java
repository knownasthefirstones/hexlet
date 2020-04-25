package io.less.game.xo.model;

public class Player {

    private final String name;  // имя игрока
    private final Figure figure;    // фигура за которую игрок играет

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
