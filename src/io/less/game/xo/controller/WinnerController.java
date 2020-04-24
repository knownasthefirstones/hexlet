package io.less.game.xo.controller;

import io.less.game.xo.model.Field;
import io.less.game.xo.model.Figure;
import io.less.game.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field) {
        // если фигура по полю 0,0 = фигуре по полю 0,1 и равна фигуре 0,2 то выводим фигуру по полю 0,0 как победитель
        try {
            /*
//            заменили на использование метода checkXYWinner();
            if (field.getFigure(new Point(0, 0)) == field.getFigure(new Point(0, 1)) &&
                field.getFigure(new Point(0, 0)) == field.getFigure(new Point(0, 2)))
                return field.getFigure(new Point(0, 0));
//            добавим цикл на проверку point x y по горизонтали через увеличение значение i
            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(i, 0), new Point(i, 1), new Point(i, 2))) {
                    return field.getFigure(new Point(i, 0));
                }
            }
//            добавим цикл на проверку point x y по вертикали через увеличение значение i
            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(0, i), new Point(1, i), new Point(2, i))) {
                    return field.getFigure(new Point(0, i));
                }
            }
//            проверка по диагоналям через if
            if (checkXYWinner(field, new Point(0 , 0), new Point(1, 1), new Point(2, 2))) {
                return field.getFigure(new Point(0, 0));
            }
            if (checkXYWinner(field, new Point(2, 0), new Point(2, 2), new Point(0, 2))) {
                return field.getFigure(new Point(2, 0));
            }*/

            /*for (int i = 0; i < field.getFieldSize(); i++) {
                // рощенный способ реализации анонимного интерфейса
                if (checkXYWinner(field, new Point(i, 0), point -> new Point(point.x + 1, point.y)))
                    return field.getFigure(new Point(i, 0));
            }

            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(0, i), new IPointChanger() {
                    @Override
                    public Point next(Point point) {
                        return new Point(point.x + 1, point.y);
                    }
                }))
                    return field.getFigure(new Point(0, i));
            }

            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(0, 0), new IPointChanger() {
                    @Override
                    public Point next(Point point) {
                        return new Point(point.x + 1, point.y + 1);
                    }
                }))
                    return field.getFigure(new Point(0, i));
            }

            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(0, 2), new IPointChanger() {
                    @Override
                    public Point next(Point point) {
                        return new Point(point.x + 1, point.y - 1);
                    }
                }))
                    return field.getFigure(new Point(0, i));
            }*/

            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(i, 0), point -> new Point(point.x, point.y + 1)))
                    return field.getFigure(new Point(i, 0));
            }
            for (int i = 0; i < field.getFieldSize(); i++) {
                if (checkXYWinner(field, new Point(0, i), point -> new Point(point.x + 1, point.y)))
                    return field.getFigure(new Point(0, i));
            }

            if (checkXYWinner(field, new Point(0, 0), point -> new Point(point.x + 1, point.y + 1)))
                return field.getFigure(new Point(0, 0));
            if (checkXYWinner(field, new Point(0, 2), point -> new Point(point.x + 1, point.y - 1)))
                return field.getFigure(new Point(1, 1));

        } catch (InvalidPointException e) {
            e.printStackTrace();
        };
        return null;
    }

/*//     создаем метод, который проверяет значение поля1, поля2 и поля3
    private boolean checkXYWinner(final Field field, final Point point1, final Point point2, final Point point3) {
        // заелючим в try catch так как иначе не даст вызвать getFigure
        try {
            if (field.getFigure(point1) == null) {
                return false;
            }
            if (field.getFigure(point1) == field.getFigure(point2) &&
                    field.getFigure(point1) == field.getFigure(point2)) {
                return true;
            }
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return false;
    }*/

/*    // поменял метод на более удобный с использованием интерфейса по замене следующего поинта
    private boolean checkXYWinner(final Field field, final Point startPoint, final IPointChanger pointChanger) {
        final Point point1 = startPoint;
        final Point point2 = pointChanger.next(point1);
        final Point point3 = pointChanger.next(point2);
        try {
            if (field.getFigure(point1) == null) return false;
            if (field.getFigure(point1) == field.getFigure(point2) &&
                    field.getFigure(point1) == field.getFigure(point2)) return true;
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return false;
    }*/

    // вызываем значение поля, сравниваем со следуюзим, далее меняем поит на следующий
    // вызываем значение по новому полю и сравниваем со следующим и так до конца поля
    private boolean checkXYWinner(final Field field, final Point currentPoint, final IPointChanger pointChanger) {
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointChanger.next(currentPoint);
        try {
            currentFigure = field.getFigure(currentPoint);
            nextFigure = field.getFigure(currentPoint);
        } catch (final InvalidPointException e) { // ксли бросаем эксепшен то скорее всего мы дошли до конца поля
            return true;
        }

        if (currentFigure == null) return false;
        if (currentFigure != nextFigure) return false;

        return checkXYWinner(field, nextPoint, pointChanger);
    }


    // добавим Интерфейс поинт ченджер который будет на вход принимать поин и возвращать следующий поинт
    private interface IPointChanger {
        Point next(final Point point);
    }

}
