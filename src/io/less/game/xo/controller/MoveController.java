package io.less.game.xo.controller;

import io.less.game.xo.model.Field;
import io.less.game.xo.model.Figure;
import io.less.game.xo.model.exceptions.AlreadyPointSetException;
import io.less.game.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException, AlreadyPointSetException {
        if (field.getFigure(point) != null) {  // если на point.x/y есть фигура то выкидываем эксепшен
            throw new AlreadyPointSetException();
        }
        field.setFigure(point, figure);
    }

}
