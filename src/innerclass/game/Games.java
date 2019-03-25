package innerclass.game;


public class Games {

	static void playGame(GameFactory gameFactory) {
		Game game = gameFactory.getGame();
		while (game.move()) {
		}
	}

	public static void main(String[] args) {
		playGame(Chess.chessGameFoFactory);
		playGame(Gobang.gameFactory);
	}

}
