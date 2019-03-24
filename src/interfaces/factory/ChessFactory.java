package interfaces.factory;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}

}
