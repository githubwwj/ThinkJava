package com.wwj.control;

//小甜饼
public class Cookie {
	
	public String name;
	
	public Cookie() {
		System.out.println("----Cookie Construct---");
	}
	
	void bite() { //包访问权限
		System.out.println("----Cookie bite------");
	}
	
	public void sayHello() { //每个对象都可以访问
		System.out.println("------Cookie sayHello------");
	}

	protected String getName() {
		return name;
	}

	//protected 继承
	protected void setName(String name) {
		this.name = name;
	}
	
}
