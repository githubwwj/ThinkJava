package polymorphic.shape;

import java.util.Random;

public class RandomShapeGenerator {

	Random random = new Random(47);

	public Shape next() {
		int p = random.nextInt(4);
		switch (p) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Rectangle();
		case 3:
			return new Triangle();
		}
	}

}
