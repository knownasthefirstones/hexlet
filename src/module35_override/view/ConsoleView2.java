package module35_override.view;

import module35_override.controller.Game;

public class ConsoleView2 extends ConsoleView {

    public ConsoleView2(final Game game) {
        super(game);
    }

    // создаем метод с идентичным интерфейсом и переопределяем его
    @Override
    public void showGameName() {
        System.out.println("*****");
        System.out.println(game.getGameName());
    }

//    private final Game game;
//
//    public ConsoleView2(final Game game) {
//        this.game = game;
//    }
//
//    public void showGameName() {
////        System.out.printf("*****");
//        printStars();
//        System.out.println(game.getGameName());
////        System.out.printf("*****");
//        printStars();
//    }
//
//    public void showPlayersName() {
//        System.out.println(game.getPlayers());
//    }
//
//    public void printStars() {
//        System.out.println("*****");
//    }

}
