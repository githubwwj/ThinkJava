package com.wwj.first;

/**
 * 算术操作符
 */
class Calc {
	public static void main(String[] args) {
		Calc calc = new Calc();

		// 创建计算器对象之后，调用计算器的功能

		int result = calc.add(3, 5);
		System.out.println("result=add(3,5)=" + result);	//8

		result = calc.minus(30, 18);
		System.out.println("result=minus(30,18)=" + result);	//12

		result = calc.mulit(20, 30);
		System.out.println("result=calc.mulit(20,30)=" + result);	//600

		int h = calc.dive(1000, 50);
		System.out.println("h=calc.dive(1000,50)=" + h);	//20

	}

	/*
	 * 加法
	 */
	public int add(int a, int b) {
		return a + b; // + 操作符进行a和b的加法运算
	}

	/**
	 * 减法
	 */
	public int minus(int a, int b) {
		return a - b;	//减号操作符让两个数字相减,生成结果,通过return 返回结果
	}

	// 乘法
	public int mulit(int a, int b) {
		return a * b;
	}

	// 除法		整形占4个字节，每个字节我们想象成一个小格子
	//每个小格子存放8位		1byte=8bits
	public int dive(int a, int b) {
		return a / b;
	}

}
