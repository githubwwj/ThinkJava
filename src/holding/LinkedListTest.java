package holding;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Pet> petList=new LinkedList<Pet>();
		petList.add(new Pet("–°÷Ì≈Â∆Ê"));
		petList.add(new Pet("œ≤—Ú—Ú"));
		petList.add(new Pet("ª“Ã´¿«"));
		
		for (Pet p : petList) {
			System.out.println(p);
		}
		System.out.println("----remove(1)----------");
		petList.remove(1);

		int size = petList.size();
		for (int i = 0; i < size; i++) {
			System.out.println(petList.get(i));
		}
		
		Pet pet = petList.get(0);
		System.out.println("contains=" + petList.contains(pet));
		petList.remove(pet);
		int index = petList.indexOf(pet);
		System.out.println("indexOf=" + index);
		
		Pet[] petArr = new Pet[petList.size()];
		petList.toArray(petArr);
		for (Pet p : petArr) {
			System.out.println(p);
		}
		
		petList.add(new Pet("ÕÙ–«»À"));
		petList.add(new Pet("◊ƒƒæƒÒ"));

		Iterator<Pet> iterator = petList.iterator();
		while (iterator.hasNext()) {
			Pet p = iterator.next();
			System.out.println("iterator----" + p);
		}
		
		ListIterator<Pet> listIterator = petList.listIterator();
		while (listIterator.hasNext()) {
			Pet p = listIterator.next();
			System.out.println(p);
		}
		while(listIterator.hasPrevious()) {
			Pet p=listIterator.previous();
			System.out.println("---listiterator-"+p);
		}

	}

}
