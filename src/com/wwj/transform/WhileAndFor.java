package com.wwj.transform;
import java.util.Random;

public class WhileAndFor {

	public static void main(String[] args) {
		while (isCondition()) {
			System.out.println("---while----");
		}
		// for(init ; booleanexpression ; step){
		// 语句
		// }
		int[] stu = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int age = random.nextInt(20) + 1;
			stu[i] = age;
		}

		// for(类型 x:集合){
		// 语句
		// }
		for (int x : stu) {
			System.out.println("x=" + x);
		}
	}

	// while(booleanexpresion){
	// 语句
	// }
	static boolean isCondition() {
		double dr = Math.random(); // 0 -1 之间数字，不包含1
		System.out.print(dr);
		if (dr < 0.8) {
			return true;
			// return 两个作用
			// 执行返回值
			// 方法结束
		} else {
			return false;
		}
	}
}
