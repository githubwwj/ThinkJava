package reusing;

class Circle extends Shape {

	Circle() {
		super();
		System.out.println("Circle()");
	}

	void erase() {
		System.out.println("Erase Circle");
		super.erase();
	}

}
