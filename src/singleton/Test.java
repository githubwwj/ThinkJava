package singleton;

public class Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			SingletonDemo2 instance = SingletonDemo2.getInstance();
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println(duration);
	}

}
