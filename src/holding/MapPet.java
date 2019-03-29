package holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapPet {

	public static void main(String[] args) {
		Map<Person, List<Pet>> map = new HashMap<Person, List<Pet>>();

		List<Pet> list1 = Arrays.asList(new Pet("喜羊羊"), new Pet("灰太狼"));
		map.put(new Person("蛋蛋"), list1);

		List<Pet> list2 = Arrays.asList(new Pet("灰太狼"), new Pet("小灰灰"), new Pet("红太狼"));
		map.put(new Person("李静"), list2);

		Set<Person> sets = map.keySet();
		for (Person key : sets) {
			List<Pet> pets = map.get(key);
			String petName = "";
			for (Pet p : pets) {
				petName += p.getName() + "  ";
			}
			System.out.println(key.name + "有了" + petName);
		}

		System.out.println("-----------------");
		
		Iterator<Person> iterator = sets.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			List<Pet> pets = map.get(person);
			String petName = "";
			for (Pet p : pets) {
				petName += p.getName() + "  ";
			}
//			map.remove(person); 迭代器中不能通過map刪除值
			System.out.println(person.name + "有了" + petName);
		}

	}

}
