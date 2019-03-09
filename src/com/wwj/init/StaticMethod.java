package com.wwj.init;

public class StaticMethod {

	public static void main(String[] args) {
		int result = StaticMethod.add(10, 5);
		System.out.println("---result=" + result);
		System.out.println(sub(5, 6));
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		int res = add(a, b);
		return res - a - b;
	}

}
