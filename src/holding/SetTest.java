package holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();

		Random random = new Random(47);
		for (int i = 0; i < 10000; i++) {
			hashSet.add(random.nextInt(15));
			// 不添加重复的元素
		}
		System.out.println(hashSet);

		Iterator<Integer> iterator = hashSet.iterator();
//		iterator.remove();
		// 先调用next方法,才能够删除元素
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(hashSet);

		SortedSet<String> treeSet = new TreeSet<String>();
		List<String> list = Arrays.asList("s a f d j k l o  p  f j t k k".split(" "));
		treeSet.addAll(list);
		System.out.println(treeSet);
	}

}
