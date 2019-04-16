package generic.shape;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Square.draw()"+id);
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()"+id);
	}

}
