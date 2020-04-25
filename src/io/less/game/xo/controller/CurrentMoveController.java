package io.less.game.xo.controller;

import io.less.game.xo.model.Field;
import io.less.game.xo.model.Figure;
import io.less.game.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {

    // определяет кто ходит
    public Figure currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getFieldSize(); x++) {
            for (int y = 0; y < field.getFieldSize(); y++ ) {
                try {
                    if (field.getFigure(new Point(x, y)) !=null) {
                        countFigure++;
                    }
                } catch (InvalidPointException e) {
                    e.printStackTrace();
                }
            }
        }
        if (countFigure == field.getFieldSize() * field.getFieldSize()) {
            return null;
        }
        // по остатку от деления на 2 четное и нечетное кол-во на поле фигур
        if (countFigure % 2 == 0) {
            return Figure.X;
        }
        return Figure.O;

/*
        int countX = 0;
        int countO = 0;
        // считаем количество X и O на поле через цикл
        // начинаем ходить с X
        for (int x = 0 ; x < field.getFieldSize(); x++) {
            for (int y = 0; y < field.getFieldSize(); y++) {
                try {
                    switch(field.getFigure(new Point(x, y))) {
                        case O: // если О то добавляем счетчик в О
                            countO++;
                            break;
                        case X:
                            countX++;
                            break;
                    }
                } catch (InvalidPointException e) {
                    e.printStackTrace();
                }
            }
        }

        // если кол-во фигур равно 3*3 то на доске нет места
        if (countO + countX == field.getFieldSize() * field.getFieldSize()) {
            return null;
        }

        // если О = Х то следующим ходит Х
        if (countO == countX) {
            return Figure.X;
        } else {
            return Figure.O;
        }
*/

    }
}
