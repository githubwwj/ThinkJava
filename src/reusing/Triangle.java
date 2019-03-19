package reusing;

class Triangle extends Shape {

	Triangle() {
		super();
		System.out.println("Triangle()");
	}

	void erase() {
		System.out.println("Erase Triangle");
		super.erase();
	}

}
