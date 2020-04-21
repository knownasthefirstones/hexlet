package module34_inheritance;

// унаследуемся от класса TwoPlayersGame

public class ThreePlayersGame extends TwoPlayersGame {

    private final String playerName3;

    public ThreePlayersGame(final String playerName1,
                            final String playerName2,
                            final String playerName3) {
        super(playerName1, playerName2);
        this.playerName3 = playerName3;
    }

    public void printPlayerName3() {
        System.out.println(this.playerName3);
    }

}
