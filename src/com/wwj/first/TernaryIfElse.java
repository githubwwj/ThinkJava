package com.wwj.first;

public class TernaryIfElse {

	public static void main(String[] args) {

		System.out.println(ternary(12));
		System.out.println(standIfElse(11));
		
	}

	public static int ternary(int a) {
		// 三目操作符/运算符 也叫作 条件操作符
		// booleanexp ? value0: values1;
		return a > 10 ? a * 100 : a * 10;	//代码简介
	}

	public static int standIfElse(int a) {
		//代码清晰
		if (a > 10) {
			return a * 10;
		} else {
			return a * 10;
		}
	}
	

}
