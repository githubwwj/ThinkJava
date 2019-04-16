package generic.people;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		Collection<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("李健",26));
		al1.add(new Student("李静",25));

		Collection<Worker> al2 = new ArrayList<Worker>();
		al2.add(new Worker("王广",27));
		al2.add(new Worker("王梁",26));
		
		Collection<Person> collection=new ArrayList<Person>();
		collection.addAll(al1);
		collection.addAll(al2);
		

		printCollection(al1);
		printCollection(al2);
		
		System.out.println("----------------");
		printCollection(collection);
		
		Person[] personArr=new Person[collection.size()];
		collection.toArray(personArr);
		for(Person p:personArr) {
			System.out.println(p);
		}
		
	}

	//指定泛型的上限Person或者它的子类型
	private static void printCollection(Collection<? extends Person> al1) { //ArrayList<Person> al1=new ArrayList<Student>();
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator = (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person=iterator.next();
			System.out.println(person.getName()+person.getAge());
		}
	}

}
