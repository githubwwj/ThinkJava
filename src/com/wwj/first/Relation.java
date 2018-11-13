package com.wwj.first;

public class Relation {

	public static void main(String[] args) {

		Integer a1 = new Integer(32);

		Integer a2 = new Integer(32);

		// 关系操作符 == != >= <= > <
		// == != 可以用于基本数据类型，也可以用于引用数据类型

		System.out.println("a1==a2		" + (a1 == a2)); // == 比较的是地址 false

		System.out.println("a1!=a2		"+ (a1 != a2)); // true		
		
		System.out.println(a1.equals(a2));  //equal 比较的是引用的对象内容
		

	}

}
