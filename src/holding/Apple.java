package holding;

import java.util.ArrayList;
import java.util.List;

public class Apple extends Fruit {
	
	public static void main(String[] args) {
//		<类型参数>
		List<Fruit> apple=new ArrayList<Fruit>();
		for(int i=0;i<3;i++) {
			apple.add(new Apple());
		}
		
		//泛型是编译器技术
		apple.add(new Orange());
		
		for(int a=0;a<apple.size();a++) {
//			holding.Apple@7852e922 包名.类型@无符号十六进制 hashCode码
			//hashCode码由C/C++实现
			System.out.println(apple.get(a));
		}
		
//		List
//		Set
//		Map<K, V>
//		Queue
		
		
	}
	
}
