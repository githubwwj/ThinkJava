package interfaces.factory;

public class GobangFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Gobang();
	}

}
