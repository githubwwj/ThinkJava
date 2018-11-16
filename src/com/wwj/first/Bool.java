package com.wwj.first;

/**
 * 逻辑操作符
 */
public class Bool {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		// 非布尔值不能当做布尔值在逻辑表达式中使用
		// && || !

		// 逻辑与是两边必须同时满足
		boolean res = (a > 1) && (b > 2); // true
		System.out.println("res=" + res);

		// 逻辑与 有短路
		boolean q1 = (a > 3) && (b > 2); // false

		System.out.println("q1=" + q1);

		boolean q2 = (a >= 2) || (b < 10); // true

		System.out.println("q2=" + q2);

		// 逻辑或有一边为true即可
		boolean q3 = (a >= 4) || (b < 10); // true

		System.out.println("q3=" + q3);

		boolean x1 = !(b > 10); // 非真即假，非假即真
		System.out.println("x1=" + x1);	//true

		boolean x2 = !(b > 1); // false
		System.out.println("x2=" + x2);

	}

}
