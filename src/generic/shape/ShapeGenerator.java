package generic.shape;

import java.util.Iterator;
import java.util.Random;

public class ShapeGenerator implements Generator<Shape>, Iterable<Shape> {

	@SuppressWarnings("rawtypes")
	private Class[] types = { Circle.class, Square.class };

	private Random random = new Random(47);

	public static void main(String[] args) {
		ShapeGenerator shapeGenerator = new ShapeGenerator();
		for (int i = 0; i < 5; i++) {
			Shape shape = shapeGenerator.next();
			shape.draw();
			shape.erase();
		}
		
		for(Shape shape:new ShapeGenerator()) {
			shape.draw();
		}
	}

	@Override
	public Shape next() {
		try {
			Class clazz = types[random.nextInt(types.length)];
			return (Shape) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Iterator<Shape> iterator() {
		return new ShapeIterator();
	}

	class ShapeIterator implements Iterator<Shape> {

		int count = 5;

		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Shape next() {
			count--;
			return ShapeGenerator.this.next();
		}

	}

}
