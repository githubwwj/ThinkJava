package generic.shape;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw()"+id);
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()"+id);
	}

}
