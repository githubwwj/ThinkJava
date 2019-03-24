package interfaces.factory;

public class Chess implements Game {

	private int move = 0;
	private final static int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move "+move);
		return ++move != MOVES;
	}

}
