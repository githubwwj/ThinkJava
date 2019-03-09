package com.wwj.init;
import java.util.Random;
public class ArrayPlay {
	public static void main(String[] args) {
		palyArr();
	}
	static void palyArr(){
		//数组定义 数据类型[] 数组名
		int[] arr1={1,2,3}; //定义数组时赋初值
		int[] arr3;
		arr3= arr1; //传递arr1数组的引用
		//数组时一块内容空间连续的,数据类型相同的对象序列
//		for(初始化;表达式;步长)
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("--------");
		for(int x:arr3){
			System.out.println(x);
		}
		
		Random random=new Random(30);
		int[] arr4=new int[random.nextInt(10)];
		//数组的内存在程序程序是分配的
		for(int i=0;i<arr4.length;i++){
			arr4[i]=random.nextInt(10);
		}
		
		for(int a:arr4){
			System.out.println("a="+a);
		}
		
		Integer[] arr5=new Integer[]{
				234, //自动装箱
				new Integer(3),
				6
		};
		System.out.println("------Integer---");
		for(int x:arr5){ //自动拆箱
			System.out.println(x);
		}
	}
}
