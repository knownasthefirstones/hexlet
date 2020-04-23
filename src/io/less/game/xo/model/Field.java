package io.less.game.xo.model;

import java.awt.*;

public class Field {

    private static final int FIELD_SIZE = 3;    // задаем константу размера поля
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];    // создаем поле с типом заполнености его значениями Figure

    public int getFieldSize() { // возвращаем размер поля
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) {    // позвращаем фигуру с типом Figure, принимаем на вход метод Point
        return field[point.x][point.y];             // возвращаем значение из массива field по индексу point.xn point.y
    }

    public void setFigure(final Point point, final Figure figure) { // кладем фигуру на поле по поинту
        field[point.x][point.y] = figure;
    }
}
