package interfaces.factory;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGmae() {
		return new Chess();
	}

}
