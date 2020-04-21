package module33_static;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.printGameName();
        game.printLevelsCount();    // non-static level method

        Game.printGameName(); // static level method
    }

}
