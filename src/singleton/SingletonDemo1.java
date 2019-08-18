package singleton;

public class SingletonDemo1 {

	private static SingletonDemo1 instnace;

	public static SingletonDemo1 getInstance() {
		if (null == instnace) {
			instnace = new SingletonDemo1();
		}
		return instnace;
	}
	
	private SingletonDemo1() {
	}

}
