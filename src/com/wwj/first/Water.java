package com.wwj.first;

import java.util.*; //util包 下面的所有类全部导入进来
//包相当于Windows 系统的文件夹
class Water   //文件名和最外边的那个类是一样的
{
	public static void main(String[] args) 
	{
		Water.stream(SOLID);
		System.out.println(new Date());
	}
	/*  后面跟的是注释
		水这个类的直观状态
		水的三个状态是水的属性，不需要水这个对象
		1 液态   2 气态   3 固态
		水的直观行为
		流动属于水的自身行为，不需要对象	
	*/
	public static final int LIQUID=1; //液态   常量名都是大写
	// 后面跟的就是注释
	public static final int GAS=2; //气态 常量名都大写
	public static final int SOLID=3; //固态
	/*
		水的流动属于类的，不需要对象
	*/
	public static void stream(int state){ 
		/*
			if(条件表达式){
			}else if(条件表达式){
			}else{
			}
		*/
		if(state==LIQUID){
			System.out.println("水是液态，可以流动。");
		}else if(state==GAS){
			System.out.println("水是气态，可以流动，可能我们看不见。");
		}else if(state==SOLID){
			System.out.println("水是固态，不可以流动。");
		}
	}
}
