package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MyCollectionAddApple {

	public static void main(String[] args) {

		List<Fruit> fruitArr = Arrays.asList(new Apple(), new Apple(), new Orange());

//		fruitArr.add(new Apple());

		List<Fruit> fruitList = new ArrayList<Fruit>();
		fruitList.add(new Apple());
//		Collection<? extends E> c
		fruitList.addAll(fruitArr);

		for (int f = 0; f < fruitList.size(); f++) {
			System.out.println(fruitList.get(f).getClass().getSimpleName() + " " + fruitList.get(f).getId());
		}
		System.out.println("clear before size=" + fruitList.size());
		fruitList.clear();
		System.out.println("clear after size=" + fruitList.size());

		Collections.addAll(fruitList, (Fruit[]) fruitArr.toArray());
		Collections.shuffle(fruitList);
		for (int f = 0; f < fruitList.size(); f++) {
			System.out.println(fruitList.get(f).getClass().getSimpleName() + " " + fruitList.get(f).getId());
		}
		
	}

}
