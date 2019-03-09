package com.wwj.init;

public class Tree {

	public static void main(String[] args) {

		Tree t1=new Tree("柳树",6);
		t1.info(8, "白杨树");
		t1.info("梧桐树", 5);
		
		Tree t2=new Tree(3,"柳树");
	}
	
	public Tree(String name,int tall){
		System.out.println("name="+name+"---tall="+tall);
	}

	public Tree(int tall,String name){
		System.out.println("tall="+tall+"---name="+name);
	}
	
	//和返回值无关
	//方法名相同
	//参数列表不同
	public int info(String name,int tall){
		System.out.println("name="+name+"---tall="+tall);
		return 10;
	}
	
	public void info(int tall,String name){
		System.out.println("tall="+tall+"---name="+name);
	}
}
