package com.wwj.first;

class Letter //定义信封 
{
	char c; //类中的属性 <==>	类中的成员

	//操作符 <==> 运算符 有 + - * / =  .

	public static void main(String[] args) 
	{
		Letter l1=new Letter();	// l1 指向 信封独享

		l1.c='A';

		System.out.println("------"+l1.c);

		sendLetter(l1);

		//如果是对象的引用，打印的是H
		//如果是对象的拷贝，打印的是A
		System.out.println("------"+l1.c);
		
	}

	//调用sendLetter方法，传递的参数是对象的应用还是对象的拷贝
	public static void sendLetter(Letter letter){
		letter.c='H';
	}

}
