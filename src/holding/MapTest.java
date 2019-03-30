package holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		Random random = new Random(47);

		// 统计每一个数字在10000次for循环出现多少次
		for (int i = 0; i < 10000; i++) {
			int key = random.nextInt(15);
			Integer value = hashMap.get(key);
			value = value == null ? 1 : ++value;
			hashMap.put(key, value);
		}

		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());

		for (Integer key : hashMap.keySet()) {
			int value = hashMap.get(key);
			System.out.println("key=" + key + "   value=" + value);
//			hashMap.remove(key);
		}
		
		 Set<Map.Entry<Integer,Integer>> set=hashMap.entrySet();
		 Iterator<Entry<Integer,Integer>> iterator = set.iterator();
		 while(iterator.hasNext()) {
			 Entry<Integer,Integer> entry= iterator.next();
			 System.out.println(entry.getKey()+"  value="+entry.getValue());
			 if(entry.getKey()==14) {
				 iterator.remove();	 
			 }
		 }
		System.out.println(hashMap);

	}

}
