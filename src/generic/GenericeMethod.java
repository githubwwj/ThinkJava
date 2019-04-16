package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericeMethod {

	public static <T> void f(T t) {
		System.out.println(t.getClass().getSimpleName() + "\t" + t.toString());
	}

	public <X> void q(X x) {
		System.out.println(x.getClass().getSimpleName() + "\t" + x.toString());
	}

	public static void main(String[] args) {
		f(10);
		f(GenericeMethod.class);

		GenericeMethod genericeMethod = new GenericeMethod();
		genericeMethod.q(30);

		Map<People, List<Pet>> map = News.getPets();
		People people = new People("Àî¾¸", 30);
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(new Pet("Tom", 3));
		pets.add(new Pet("Jerry", 4));
		map.put(people, pets);

		printPets(map);
	}

	private static void printPets(Map<People, List<Pet>> map) {
		Iterator<People> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			People people = iterator.next();
			System.out.println(people);
			List<Pet> pets = map.get(people);
			for(Pet p:pets) {
				System.out.println("\t"+p.toString());
			}
		}
	}

}
