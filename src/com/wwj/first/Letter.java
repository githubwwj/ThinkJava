package com.wwj.first;

/**
 * 赋值操作符
 */
class Letter // 定义信封
{
	char c; // 类中的属性 <==> 类中的成员

	// 操作符 <==> 运算符 有 + - * / = .

	public static void main(String[] args) {
		Letter l1 = new Letter(); // l1 指向 信封独享

		l1.c = 'A';	//字符A是一个常量
			
		l1.c = 'Z';	//字符Z是一个常量

		System.out.println("------" + l1.c);	//------Z

		sendLetter(l1);

		System.out.println("------" + l1.c);	//------H
	}

	// 调用sendLetter方法，传递的参数是对象的引用
	public static void sendLetter(Letter letter) {
		letter.c = 'H';
	}

}
