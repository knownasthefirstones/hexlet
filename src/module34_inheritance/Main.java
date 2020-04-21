package module34_inheritance;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();
        game.printGameName();
        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("A", "B");

        twoPlayersGame.printPlayerName1();
        twoPlayersGame.printPlayerName2();
        twoPlayersGame.printGameName(); // доступен метод родительского класса

        final ThreePlayersGame threePlayersGame = new ThreePlayersGame("C", "D", "E");
        threePlayersGame.printPlayerName1();    // доступен метод родительского класса
        threePlayersGame.printPlayerName2();    // доступен метод родительского класса
        threePlayersGame.printPlayerName3();    // доступен метод родительского класса
        threePlayersGame.printGameName();       // доступен метод родительского класса

        printGameNameOnBoard(threePlayersGame, board);
        // threePlayersGame - является game, так как унаследован от Game <- TwoPlayersGame

    }

    private static void printGameNameOnBoard(final Game game, final Board board) {
        game.printGameName();
        System.out.println("-----");
    }

}
