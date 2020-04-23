package io.less.game.xo.model;

import io.less.game.xo.model.exceptions.AlreadyPointSetException;
import io.less.game.xo.model.exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void getFieldSize() throws Exception {
        final Field field = new Field();
        final int expectedValue = 3;
        final int returnValue = field.getFieldSize();

        assertEquals(expectedValue, returnValue);
    }

    @Test
    void setFigure() throws AlreadyPointSetException, InvalidPointException {  // добавляем эксепшены так как они есть в методе в классе setFigure
        final Field field = new Field();                    // созадем поле
        final Point inputPoint = new Point(0, 0);     // создаем проинт по индексу 0, 0
        final Figure inputFigure = Figure.X;                // создаем фигуру

        field.setFigure(inputPoint, inputFigure);           // сетим фигуру по индексу поинта
        final Figure returnFigure = field.getFigure(inputPoint);    // достаем фигуру по индексу

        assertEquals(inputFigure, returnFigure); // сравниваем значения
    }

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception { // тест если фигура не установлена, тоесть поле пустое null
        final Field field = new Field();                             // создаем объект поля
        final Point inputPoint = new Point(0, 0);              // задаем значение поинта x y
        final Figure returnFigure = field.getFigure(inputPoint);     // получаем значение поля по указателю поинт

//        assertEquals(null, returnFigure);                   // ожидаем результат null
        assertNull(returnFigure);
    }

    @Test
    public void testGetFigureWhenPointXIsNotCorrect1() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);

        try {
            field.getFigure(inputPoint); // должен выскачить эксепшен иначе тест перейдет на строчку с fail()
            fail(); // если тест дойдет до данной строчки то тест завалится
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenPointXIsNotCorrect2() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getFieldSize() + 1, 0);

        try {
            field.getFigure(inputPoint); // должен выскачить эксепшен иначе тест перейдет на строчку с fail()
            fail(); // если тест дойдет до данной строчки то тест завалится
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenPointYIsNotCorrect1() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);

        try {
            field.getFigure(inputPoint); // должен выскачить эксепшен иначе тест перейдет на строчку с fail()
            fail(); // если тест дойдет до данной строчки то тест завалится
        } catch (final InvalidPointException e) {}
    }

    @Test
    public void testGetFigureWhenPointYIsNotCorrect2() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getFieldSize() + 1);

        try {
            field.getFigure(inputPoint); // должен выскачить эксепшен иначе тест перейдет на строчку с fail()
            fail(); // если тест дойдет до данной строчки то тест завалится
        } catch (final InvalidPointException e) {}
    }

}