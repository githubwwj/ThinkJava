package com.wwj.first;

class  AutoIncrease
{
	public static void main(String[] args) 
	{
		
		// 自动递增和递减
		// 增加一个单元或者减少一个单元
		//举个列子

		int a=10;
		System.out.println("a="+a);

		//前缀递增
		System.out.println("++a ="+ (++a));	// a = a+1   11  先运算，再赋值

		//后缀递增
		System.out.println("a++ ="+ (a++)); // 先赋值，接着打印，再运算	a =11

		System.out.println("a="+a);	// a= 12

		System.out.println("---------------------");

		//后缀递减
		System.out.println("a-- ="+ (a--));	//a=12 a = a-1   先赋值 12，接着打印，再运算	a =12-1
		System.out.println("a="+a);	//a=11

		//前缀递减
		System.out.println("--a ="+ (--a));	//a=a-1  a=11-1  a=10	 // 先运算，在复制，最后打印a
		System.out.println("a="+a);	//a=10


	}
}
