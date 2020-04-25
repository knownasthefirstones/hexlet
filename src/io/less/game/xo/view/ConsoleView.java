package io.less.game.xo.view;

import io.less.game.xo.controller.CurrentMoveController;
import io.less.game.xo.controller.MoveController;
import io.less.game.xo.controller.WinnerController;
import io.less.game.xo.model.Field;
import io.less.game.xo.model.Figure;
import io.less.game.xo.model.Game;
import io.less.game.xo.model.exceptions.AlreadyPointSetException;
import io.less.game.xo.model.exceptions.InvalidPointException;
import org.omg.CORBA.Current;

import java.awt.*;
import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleView {

    private static CurrentMoveController currentMoveController = new CurrentMoveController();
    private static WinnerController winnerController = new WinnerController();
    private static MoveController moveController = new MoveController();

    public void show(final Game game) {
        System.out.printf("Game name: %s\n", game.getGameName());
        final Field field = game.getField();
        for (int x = 0; x < field.getFieldSize(); x++) {
            if (x != 0) {
                printSeparator(); // выводим разделитель если не первая и последняя строчка
            }
            printLine(field, x); // запускаем метод с выводом на экран
        }
    }

    public static boolean move(final Game game) { // необходимо запросить координату
        final Field field = game.getField();
        final Figure winner = winnerController.getWinner(field); // запрашиваем победителя
        if (winner != null) {   // если нашелся победитель то игра закончится
            System.out.printf("Winner is %s", winner);
            return false;
        }
        final Figure currentFigure = currentMoveController.currentMove(field); // спрашиваем кто следующий игрок
        if (currentFigure == null) {    // возвратит нул только если ничья
            System.out.println("No winner and no moves");
            return false;
        }
        System.out.printf("Please enter move point for: %s\n", currentFigure);
        final Point point = askPoint();
        try {
            moveController.applyFigure(field, point,currentFigure);
        } catch (final InvalidPointException e) {
//            e.printStackTrace();
            System.out.println("Point is invalid");
        } catch (final AlreadyPointSetException e) {
//            e.printStackTrace();
            System.out.println("Point already set");
        }
        return true;
    }

    // запрашиваем координату для ввода
    private static int askCoordinate(final String coordinate) {
        final Field field = new Field(3);
        System.out.printf("Input coordinate: %s", coordinate);
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();   // добавил проверку на неверное значение введенное игроком
        } catch (final InputMismatchException e) {
            System.out.printf("Input correct point from: 0 to %s\n", field.getFieldSize());
            return askCoordinate(coordinate);
        }

    }

    // запрашивается Поинт через askCoordinate - 1 (по индексу массива)
    private static Point askPoint(){
        return new Point(askCoordinate("X") - 1, askCoordinate("Y") - 1);
    }

    private void printLine(final Field field, final int x) {
        for (int y = 0; y < field.getFieldSize(); y++) {
            if (y != 0) {
                System.out.print("|");
                System.out.print(" ");
            }
            final Figure figure;
            try {
                figure = field.getFigure(new Point(y, x)); // достаем фигурку по координатам на поле
            } catch (final InvalidPointException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            // если фигура != нулю то печатаем фигуру, если равна нулю то печатаем что идет после :
            System.out.print(figure != null ? figure : " ");   // выводим на экран
            System.out.print(" ");
        }
        System.out.println();
    }

    private void printSeparator() {
        System.out.println("---------");
    }

}
