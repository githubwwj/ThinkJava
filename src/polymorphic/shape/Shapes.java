package polymorphic.shape;

public class Shapes {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[8];

		RandomShapeGenerator shapeGenerator = new RandomShapeGenerator();
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = shapeGenerator.next();
		}
		
		for(Shape s : shapes) {
			s.draw();
		}
		
		for(Shape s : shapes) {
			s.erase();
		}
		
	}

}
