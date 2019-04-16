package generic.people;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("李健",26));
		al1.add(new Student("李静",25));

		ArrayList<Worker> al2 = new ArrayList<Worker>();
		al2.add(new Worker("王麻子",27));
		al2.add(new Worker("王梁",26));
		

		printCollection(al1);
		printCollection(al2);
		
		System.out.println("------------------");
		printCollection2(al1);
//		printCollection2(al2);
	}

	//? 通用类型 	不知道是那种类型
	//只能打印Person这个类型 或者 它的子类型  
	//指定泛型的上限
	private static void printCollection(ArrayList<? extends Person> al1) {
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator = (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person=iterator.next();
			System.out.println(person.getName()+person.getAge());
		}
	}

	//指定泛型的下限
	private static void printCollection2(ArrayList<? super Student> al1) {
		@SuppressWarnings("unchecked")
		Iterator<Person> iterator =  (Iterator<Person>) al1.iterator();
		while (iterator.hasNext()) {
			Person person=iterator.next();
			System.out.println(person.getName()+person.getAge());
		}
	}
}
