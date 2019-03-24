package interfaces.factory;

public class Games {
	
	static void playGame(GameFactory gameFactory) {
		Game game=gameFactory.getGmae();
		while(game.movie()) ;
	}
	
	public static void main(String[] args) {
		playGame(new ChessFactory());
		playGame(new GobangFactory());
	}

}
