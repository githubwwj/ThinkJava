package com.wwj.first;

/**
 * 关系操作符
 */
public class Relation {

	public static void main(String[] args) {

		Integer a1 = new Integer(32);

		Integer a2 = new Integer(32);

		// 关系操作符 == != >= <= > <
		// == != 可以用于基本数据类型，也可以用于引用数据类型

		// 关系操作符用于生成布尔值

		// == != 可以比较所有的数据类型

		int a = 30;
		int b = 35;

		System.out.println("a1==a2		" + (a1 == a2)); // == 比较的是对象的地址 false

		System.out.println("a1!=a2		" + (a1 != a2)); // true

		// 怎么比较对象的内容,JAVA的所有类型基本都实现了equals函数
		System.out.println("a1.equals(a2)		" + a1.equals(a2)); // equal 比较的是对象内容
		// true

		System.out.println("a==b	" + (a == b)); // false

		System.out.println("a>b		" + (a > b));	//false
		
		System.out.println("a<b		"+(a<b));
		
		

	}

}
