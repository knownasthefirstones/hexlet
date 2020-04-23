package io.less.game.xo.model;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void getFieldSize() {
        final Field field = new Field();
        final int expectedValue = 3;
        final int returnValue = field.getFieldSize();

        assertEquals(expectedValue, returnValue);
    }

    @Test
    void setFigure() {
        final Field field = new Field();                    // созадем поле
        final Point inputPoint = new Point(0, 0);     // создаем проинт по индексу 0, 0
        final Figure inputFigure = Figure.X;                // создаем фигуру

        field.setFigure(inputPoint, inputFigure);           // сетим фигуру по индексу поинта
        final Figure returnFigure = field.getFigure(inputPoint);    // достаем фигуру по индексу

        assertEquals(inputFigure, returnFigure); // сравниваем значения
    }

}