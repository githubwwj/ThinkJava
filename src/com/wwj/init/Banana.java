package com.wwj.init;

public class Banana {

	String name="a";
	int count;

	// 无参构造函数 <==> 默认构造函数
	public Banana() {
		System.out.println("---No Args Construct------");
	}

	// this:调用方法的那个对象引用
	// 构造函数 : 特殊方法
	public Banana(String name, int count) {
		this.name = name;
		this.count = count;
	}

	void print() {
		System.out.println("张三买了" + name + count + "个");
	}
	
	Banana increment(){
		count ++;
		return this;
	}

	public static void main(String[] args) {

//		Banana a = new Banana();

		Banana b = new Banana("广东香蕉", 6);
		b.print();
		b.increment().increment().increment().print();

	}

}
