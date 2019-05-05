package holding;

import java.util.AbstractCollection;
import java.util.Iterator;

public class SequenceCollection extends AbstractCollection<Pet> {

	private Pet[] pets = { 
			new Pet("π˛ ø∆Ê"), new Pet("≤ÿÈ·"), new Pet("≤©√¿»Æ") };

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int next = 0;

			@Override
			public boolean hasNext() {
				return next<size();
			}

			@Override
			public Pet next() {
				return pets[next++];
			}
		};
	}

	@Override
	public int size() {
		return pets.length;
	}

	public static void main(String[] args) {
		SequenceCollection sequenceCollection=new SequenceCollection();
		Iterator<Pet> it=sequenceCollection.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Pet p: sequenceCollection) {
			System.out.println(p);
		}
		
	}

}
