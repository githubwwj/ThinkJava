package generic.people;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hello");
		al1.add("world");

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(3);
		al2.add(10);

		printCollection(al1);
		printCollection(al2);
	}

	//? 不知道是那种类型,通用类型 	
	private static void printCollection(ArrayList<?> al1) {
		Iterator<?> iterator = al1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
