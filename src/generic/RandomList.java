package generic;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {

	private Random random = new Random(47);
	private ArrayList<T> arrayList = new ArrayList<T>();

	public void add(T t) {
		arrayList.add(t);
	}

	public T select() {
		return arrayList.get(random.nextInt(arrayList.size()));
	}

	/**
	 * ·ºÐÍ·½·¨
	 * 
	 * @param args
	 */

	public <E, W, Q> void f(E e, W w, Q q) {
		System.out.println(e.getClass().getSimpleName() + "\t" + e.toString() + "\t" + w + "\t" + q);
	}

	public static void main(String[] args) {
		String str = "JAVA Programs very good !";
		RandomList<String> randomList = new RandomList<String>();

		for (String s : str.split(" ")) {
			randomList.add(s);
		}

		for (int i = 0; i < 10; i++) {
			String res = randomList.select();
			System.out.println(res);
		}

		System.out.println("----------------");
		randomList.f(10, 20.3f, 100);
		randomList.f(20.3f, "hello", randomList);
		randomList.f("hello", 10L, 20);

	}

}
