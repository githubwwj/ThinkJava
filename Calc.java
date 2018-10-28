class Calc 
{
	public static void main(String[] args) 
	{
		Calc calc=new Calc();

		//创建计算器对象之后，调用计算器的功能

		int result=calc.add(3,5);
		System.out.println("result=add(3,5)="+result);

		result=calc.minus(30,18);
		System.out.println("result=minus(30,18)="+result);

		result=calc.mulit(20,30);
		System.out.println("result=calc.mulit(20,30)="+result);

		int h=calc.dive(1000,50);
		System.out.println("h=calc.dive(1000,50)="+h);

	}

	/*
	*	加法
	*/
	public int add(int a,int b)
	{
		return a+b; // + 操作符进行a和b的加法运算
	}

	/**
	*	减法
	*/
	public int minus(int a,int b)
	{
		return a-b;
	}

	//乘法
	public int	mulit(int a,int b)
	{
		return a*b;
	}

	//除法
	public int dive(int a,int b){
		return a/b;
	}

}
