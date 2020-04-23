package learning.module35_override;

import learning.module35_override.controller.Game;
import learning.module35_override.view.ConsoleView;
import learning.module35_override.view.ConsoleView2;

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
