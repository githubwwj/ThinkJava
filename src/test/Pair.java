package test;

public class Pair {

	private int x, y;

	public Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Pair() {
		this.x = 0;
		this.y = 0;
	}

	public void incrementX() {
		x++;
	}

	public void incrementY() {
		y++;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public class PairValuesNotEqualsException extends RuntimeException {
		public PairValuesNotEqualsException() {
			super("Pair values not equals " + Pair.this);
		}
	}

	public void checkState() {
		if (x != y) {
			throw new PairValuesNotEqualsException();
		}
	}

	

	@Override
	public String toString() {
		return "x:" + x + ",y:" + y;
	}
}
