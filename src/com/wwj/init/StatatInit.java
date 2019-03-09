package com.wwj.init;

class Bowl{
	public Bowl(int marker){
		System.out.println("bowl("+marker+")");
	}
	public void  f1(){
		System.out.println("f1");
	}
}

class Table{
	
	Bowl bowl1=new Bowl(1);
	
	public Table(int marker){
		System.out.println("Table("+marker+")");
		bowl2.f1();
		
	}
	void f2(){
		System.out.println("f2");
	}
	
	//静态对象只会创建一次
	static Bowl bowl2=new Bowl(2);
	//静态代码只会执行一次
	static{
		Bowl bow3=new Bowl(3);
	}
}

public class StatatInit {

	public static void main(String[] args) {
		new Table(2);
		new Table(3);
	}

	static Table table=new Table(1);
	
}
