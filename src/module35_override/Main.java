package module35_override;

import module35_override.controller.Game;
import module35_override.view.ConsoleView;
import module35_override.view.ConsoleView2;
import sun.text.resources.no.CollationData_no;

public class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final ConsoleView consoleView = new ConsoleView(game);
        final ConsoleView2 consoleView2 = new ConsoleView2(game);
        // при вызове данного метода, java будет искать с самого дальнего потомка
        startGame(consoleView2);
    }

    private static void startGame(ConsoleView consoleView) {
        consoleView.showGameName();
    }

}
