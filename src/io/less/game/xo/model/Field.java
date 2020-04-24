package io.less.game.xo.model;

import io.less.game.xo.model.exceptions.AlreadyPointSetException;
import io.less.game.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class Field {

//    private static final int FIELD_SIZE = 3;    // задаем константу размера поля
//    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];    // создаем поле с типом заполнености его значениями Figure

    private final Figure[][] field;
    private final int fieldSize;

    public Field(final int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize]; // поле заполняется массивом фигур
    }

    public int getFieldSize() { // возвращаем размер поля
        return fieldSize;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {    // позвращаем фигуру с типом Figure, принимаем на вход метод Point
        if (!checkPointCoordinate(point)) {     // добавил эксепшен на проверку валиндности координаты
            throw new InvalidPointException();
        }
        return field[point.x][point.y];             // возвращаем значение из массива field по индексу point.xn point.y
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException { // кладем фигуру на поле по поинту
        if (!checkPointCoordinate(point)) {     // добавил эксепшен на проверку валиндности координаты в пределах поля
            throw new InvalidPointException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPointCoordinate(final Point point) {  // проверка поля если мы укажем за рамки FIELD_SIZE и будет вызывать метод проверки x и Y
        return checkXYCoordinate(point.x) && checkXYCoordinate(point.y); // true если X и Y валидны
    }

    private boolean checkXYCoordinate(final int coordinate) {  // проверка X и Y по одинаковому правилу, поэтому сделаем отдельный метод и передадим выше
        return coordinate >= 0 && coordinate <= field.length;     // ретернит true если координата валидна
    }

}
