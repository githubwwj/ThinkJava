package innerclass.game;

public class Chess implements Game {

	private int move = 0;
	private final static int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move "+move);
		return ++move != MOVES;
	}
	
	public static GameFactory chessGameFoFactory=
			new GameFactory() {
		@Override
		public Game getGame() {
			return new Chess();
		}
	};

}
