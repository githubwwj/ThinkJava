package interfaces.shape;

public class Shapes {

	static void draw(Shape shape) {
		shape.draw();
	}
	
	static void erase(Shape shape) {
		shape.erase();
	}
	
	public static void main(String[] args) {
		
		Shape shape  = new Circle();
		draw(shape);
		erase(shape);

		System.out.println(Shape.COUNT);
		
		
		shape = new Square();
		draw(shape);
		erase(shape);
		
//		Circle.draw()
//		Circle.erase
//		10
//		Square.draw()
//		Square.erase()


	}

}
