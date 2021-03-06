package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MyLikePets {
	
	//面向接口编程
	//迭代器 ：遍历打印
	//通过通过方便遍历
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------Iterator--------");
	}
	
	public static void display(Collection<Pet> pets) {
		for(Pet p:pets) {
			System.out.println(p);
		}
		System.out.println("---------Collection-------");
	}

	public static void main(String[] args) {
		
		List<Pet> pets=new ArrayList<Pet>();
		pets.add(new Pet("哈士奇"));
		pets.add(new Pet("藏獒"));
		pets.add(new Pet("博美犬"));
		
		LinkedList<Pet> petsLL=new LinkedList<Pet>(pets);
		HashSet<Pet> petsHS=new HashSet<Pet>(pets);
		LinkedHashSet<Pet> petsLHS=new LinkedHashSet<Pet>(pets);
		TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
		
//		implements XXX
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsLHS.iterator());
		display(petsTS.iterator());
		
		display(pets);
		display(petsLL);
		display(petsHS);
		display(petsLHS);
		display(petsTS);
		
//		class HashMap<K,V> extends AbstractMap<K,V>
//		class AbstractMap<K,V> extends Object implements Map<K,V>
		
		//ArrayList<E> extends  AbstractList<E> 
//		extends AbstractCollection<E> implements List<E>
//		 implements Collection<E> {
		
		//LinkedList<E>extends AbstractSequentialList<E> extends
//		 AbstractList<E> extends AbstractCollection<E> implements List<E>
//		 implements Collection<E> {
		
		//LinkedHashSet<E>extends HashSet<E>
		// HashSet<E>extends AbstractSet<E> extends AbstractCollection<E> implements Set<E>
//		implements Collection<E> {
		
//		TreeSet<E> extends AbstractSet<E>	
		
	

	}

}
