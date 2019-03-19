package reusing;

public class Cart {

	Engine engine = new Engine();
	Whell[] whells = new Whell[4];
	Door leftDoor = new Door();
	Door rightDoor = new Door();

	Cart() {
		for (int i = 0; i < whells.length; i++) {
			whells[i] = new Whell();
		}
	}

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.whells[0].inflate();
		cart.engine.open();
		cart.leftDoor.leftWindow.rollup();
	}

	class Engine {
		void open() {
			System.out.println("点火了");
		}

		void close() {
			System.out.println("关闭发送机");
		}
	}

	class Whell {
		void inflate() {
			System.out.println("车轮充气");
		}
	}

	class Door {
		Window leftWindow = new Window();
		Window rightWindow = new Window();

		void open() {
		}

		void close() {
		}
	}

}
