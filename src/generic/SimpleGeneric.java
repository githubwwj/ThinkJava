package generic;

import java.util.ArrayList;

public class SimpleGeneric {

	public static void main(String[] args) {

		test1();
		
		test2();

	}

	private static void test2() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(10));
		al.add(20);
		
		for(int i=0;i<al.size();i++) {
			int q=al.get(i);
			System.out.println(q);
		}
		
	}

	private static void test1() {
		ArrayList<String> al = new ArrayList<String>();

//		al.add(10);
		al.add("hello");

		for (int i = 0; i < al.size(); i++) {
//			Object obj=al.get(i);
			String str = al.get(i);//java.lang.Integer cannot be cast to java.lang.String
			System.out.println(str);
		}
	}
	
	

}
