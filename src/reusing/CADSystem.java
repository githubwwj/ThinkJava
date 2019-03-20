package reusing;

public class CADSystem extends Shape {

	private Circle circle;
	private Triangle triangle;

	CADSystem() {
		super();
		circle = new Circle();
		triangle = new Triangle();
		System.out.println("--CADSystem() combo");
	}

	public static void main(String[] args) {
		CADSystem cadSystem = new CADSystem();
		cadSystem.erase();
		cadSystem.circle.position(10, 20);
	}

	//清理和创建正好相反
	void erase() {
		System.out.println("-------------");
		circle.erase();
		triangle.erase();
		System.out.println("CADSystem erase");
		super.erase();
	}

	// Shape()
	// Shape()
	// Circle()
	// Shape()
	// Triangle()
	// --CADSystem() combo
	
	//Erase Circle
	//Erase Shape
	//Erase Triangle
	//Erase Shape
	//CADSystem erase
	//Erase Shape

}
