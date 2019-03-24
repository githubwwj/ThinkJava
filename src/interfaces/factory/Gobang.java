package interfaces.factory;

public class Gobang implements Game {

	private final int MOVES = 5;
	private int move = 0;

	@Override
	public boolean movie() {
		System.out.println("Gobang move" + move);
		return ++move != MOVES;
	}

}
