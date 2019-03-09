package com.wwj.init;

//初始化顺序
public class InitOrder {

	public static void main(String[] args) {
		Hourse hourse=new Hourse(1);
		hourse.f();
	}

}


class Hourse{
	
	Window w1=new Window(1);	//指定初始化
	
	Hourse(int marker){
		System.out.println("hourse("+marker+")");
		w3=new Window(4);
	}
	
	Window w2=new Window(2); //指定初始化
	
	void f(){
		System.out.println("f");
	}
	
	Window w3=new Window(3);
}

class Window {
	public Window(int market) {
		System.out.println("window(" + market + ")");
	}
}
