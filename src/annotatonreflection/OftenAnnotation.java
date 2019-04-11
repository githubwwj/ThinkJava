package annotatonreflection;

import java.util.List;

public class OftenAnnotation extends Object{

	public static void main(String[] args) {
		
		int result=add(11, 6);
		System.out.println(result);

	}
	
	
	@Override
	public String toString() {
		return "OftenAnnotation";
	}
	
	//代码不建议使用,代码被弃用了,但可以使用
	@Deprecated
	static int add(int a,int b) {
		return a+b;
	}
	
	
	@SuppressWarnings(value = { "all" })
	void sayHello() {
		List list;
		List list2;
	}

}
