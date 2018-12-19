package com.wwj.first;

/**
 * 类型转换
 */
public class TypeTransform {

	public static void main(String[] args) {
		//强制类型转换
		int a=100;	//4 个字节
		long b=a;	//8 个字节
		long c=(long)a;
		
		System.out.println("a="+a+"---b="+b+"---c="+c);
		
		
		int d =(int)c;
		System.out.println("d="+d);
		
		
		float f1= 10.52342324f;	//4 个字节
		double d1=f1;		//8 个字节
		System.out.println("f1="+f1+"--d1="+d1);
		
		float f2 =(float) d1;
		System.out.println("f2="+f2);
		
		//截尾和输入
		double d2=234.56;
		System.out.println((int)f1+"-------d2="+(int)d2);
		
		double d3=f2 * d2;
		System.out.println("d3="+d3);
	}

}
