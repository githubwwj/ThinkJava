package reusing;

class Shape {

	Shape() {
		System.out.println("Shape()");
	}

	void erase() {
		System.out.println("Erase Shape");
	}

	// 锁定了这个方法
	final void size() {

	}

	private final void position(int x, int y) {
		System.out.println("Shape x=" + x + "  y=" + y);
	}

}
