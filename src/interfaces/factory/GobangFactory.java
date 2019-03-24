package interfaces.factory;

public class GobangFactory implements GameFactory {

	@Override
	public Game getGmae() {
		return new Gobang();
	}

}
