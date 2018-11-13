package com.wwj.first;

class ObjectReference //类的名字对象引用  
//类的名字和文字名字是一致的，否则会出错的
{
	public static void main(String[] args) //程序入口
	{
		String str=new String("今天天不错，因为天气很晴朗!");
		//通过new 关键字创建了一个对象
		//RAM随机访问寄存器Random Access Memory(内存条),存储在内存的堆区中
		//对象的引用存储在堆栈中（栈）
		System.out.println(str);
		
	}
}
// 项目地址 https://github.com/githubwwj/ThinkJava
