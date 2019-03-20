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

//	//锁定了这个方法
//		final void size() {
//			
//		}
	// 没有重写父类的position方法
	// 自己编的的一段程序带啊没 
	final void position(int x, int y) {
		System.out.println("Circle x=" + x + "  y=" + y);
	}

}
