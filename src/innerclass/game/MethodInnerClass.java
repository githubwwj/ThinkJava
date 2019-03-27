package innerclass.game;

public class MethodInnerClass {

	public Counter count() {
		class A implements Counter {
			int count = 10;

			public void count() {
				count++;
				System.out.println(count);
			}
		}
		return new A();
	}
	
	public Counter count2() {
		return new Counter() {
			int count = 12;
			@Override
			public void count() {
				count++;
				System.out.println(count);
			}
		};
	};

	public static void main(String[] args) {

		MethodInnerClass innerClass = new MethodInnerClass();
		Counter count=innerClass.count();
		count.count();
		innerClass.count2().count();

	}

}
