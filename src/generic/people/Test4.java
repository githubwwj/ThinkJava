package generic.people;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		TreeSet<Student> al1 = new TreeSet<Student>(new ByName());
		al1.add(new Student("李健", 26));
		al1.add(new Student("李静", 25));
		al1.add(new Student("abc", 29));

		TreeSet<Worker> al2 = new TreeSet<Worker>(new ByName());
		al2.add(new Worker("王梁", 20));
		al2.add(new Worker("王广", 27));
		al2.add(new Worker("hello", 10));

		TreeSet<Person> collection = new TreeSet<Person>(new ByName());
		collection.addAll(al1);
		collection.addAll(al2);

		printCollection(collection);
		printCollection(al2);

	}

	// 指定泛型的上限Person或者它的子类型
	private static void printCollection(Collection<? extends Person> al1) { // ArrayList<Person> al1=new
																			// ArrayList<Student>();
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator = (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.getName() + person.getAge());
		}
	}

	private static class ByName implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			int temp = o1.getName().compareTo(o2.getName());
			return temp == 0 ? o1.getAge() - o2.getAge() : temp;
		}

	}

}
