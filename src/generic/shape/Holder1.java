package generic.shape;

public class Holder1<T> {

	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void draw() {
//		t.draw();
	}
	
	//T 只能是形状或者形状的子类
	public class Holder2<T extends Shape> {
		
		T t;
		public T getT() {
			return t;
		}
		public void setT(T t) {
			this.t = t;
		}
		public void draw() {
			t.draw();
		}
		
	}
	
	//泛型的擦除
	public class Holder3{
		
		Shape t;
		public Shape getT() {
			return t;
		}
		public void setT(Shape t) {
			this.t = t;
		}
		public void draw() {
			t.draw();
		}
		
	}
	
	//字节码文件中
	public class Holder4{
		
		Object t;
		public Object getT() {
			return t;
		}
		public void setT(Object t) {
			this.t = t;
		}
		public void draw() {
			if(t instanceof Shape) {
				((Shape) t).draw();
			}
		}
		
	}
	
	
}


