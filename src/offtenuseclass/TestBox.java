package offtenuseclass;

public class TestBox {

	public static void main(String[] args) {

		// 自动装箱
		Integer i = 5; // 编译器帮我们干了这个事Integer i = Integer.valueOf(5); 自动装箱
		Integer i2 = Integer.valueOf(5);
		System.out.println(i == i2);

		Integer i3 = 128;
		Integer i4 = Integer.valueOf(128);
		System.out.println(i3 == i4);

		int j = i3; // i3.intValue(); 编译器干的自动拆箱
		int j1 = i3.intValue();
		
		Integer q1=null;
		int q2 = q1; //q1.intValue();

	}

}
