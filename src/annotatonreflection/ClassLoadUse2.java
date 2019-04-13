package annotatonreflection;

import java.util.Random;

//接口初始化不要求父接口初始话
public class ClassLoadUse2 {

//	被标记为启动类的类 
	public static void main(String[] args) {
		System.out.println(Art.a);
	}

	static {
		System.out.println("ClassLoader2");
	}

}

interface Art {
	public static final int a = new Random().nextInt(10);
	Thread thread = new Thread() {
		{
			System.out.println("Art thread 对象");
		}
	};
}

interface Draw extends Art {
	Thread thread = new Thread() {
		{
			System.out.println("draw thread 对象");
		}
	};
	int b = new Random().nextInt(20);
}
