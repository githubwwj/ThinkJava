package com.wwj.init;

public class VarAggs {
	
	public static void main(String[] args) {

		print(new Object[]{1,10.5,33.20});
		
		print(new Object[]{new String("one"),"two",new Integer(100),36});
		
		String[] str={"123","abc"};
		print(str);
	}
	
	static void print(Object object[]){
		for(Object obj:object){
			System.out.println(obj);
		}
		System.out.println("----------");
	}
	
	//里面就是一个数组
	static void print(String ... strs){
		for(String s:strs){
			System.out.println(s);	
		}
		System.out.println("----------");
	}

}
