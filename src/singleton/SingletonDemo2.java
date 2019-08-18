package singleton;

public class SingletonDemo2 {
	
	private SingletonDemo2() {
	}

	public static SingletonDemo2 getInstance() {
		return Demo2.instance;
	}

	private static class Demo2 {
		private static SingletonDemo2 instance = new SingletonDemo2();
	}
}
