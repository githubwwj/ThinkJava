package generic.shape;

public abstract class Shape {

	private static int count = 0;
	public int id = ++count;

	public abstract void draw();

	public abstract void erase();

}
