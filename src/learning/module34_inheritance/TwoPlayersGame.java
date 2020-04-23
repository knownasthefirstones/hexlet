package learning.module34_inheritance;

// унаследуемся от класса Game

public class TwoPlayersGame extends Game {

    private final String playerName1;
    private final String playerName2;

    public TwoPlayersGame(final String playerName1,
                          final String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public void printPlayerName1() {
        System.out.println(this.playerName1);
    }

    public void printPlayerName2() {
        System.out.println(this.playerName2);
    }

}
