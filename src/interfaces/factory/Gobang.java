package interfaces.factory;

public class Gobang implements Game {

	
	private int move = 0;
	private final static int MOVES = 5;

	@Override
	public boolean move() {
		System.out.println("Gobang move "+move);
		return ++move != MOVES;
	}

}
