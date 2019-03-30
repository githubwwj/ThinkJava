package holding;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {

	public static void main(String[] args) {
		IterableClass iterableClass = new IterableClass();
		for (String s : iterableClass) {
			System.out.println(s + " ");
		}
	}
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {

			String[] like = "Hello Java I Like Pets!".split(" ");
			private int index = 0;

			private void printIndex() {
				System.out.print("index=" + index+"----");
			}

			@Override
			public String next() {
				printIndex();
				return like[index++];
			}

			@Override
			public boolean hasNext() {
				return index < like.length;
			}
		};
	}

}
