package interfaces.factory;

public class Chess implements Game{

	private final int MOVES=4;
	private int move=0;
	
	@Override
	public boolean movie() {
		System.out.println("Chess move"+move);
		return ++move !=MOVES;
	}

}
