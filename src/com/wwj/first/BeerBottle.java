package com.wwj.first;

class BeerBottle //定义一个平酒瓶类
{
	int bottom; // 70mm 属性<===>成员变量 <==> 外观  <==> 成员
	int height;// 280
	int outside;// 26
	int inside; //15
	float capacity; //580ml   //代表注释
	String capacityUnit="ml";
	//java会自动给类的成员变量初始化值，但是有时候初始化的值不正确，所以我们手动初始化程序的初始值是很重要的

	Beer beer=new Beer(); // Beer 类名 <===> 类的类型  引用类型
	int addBeerCount;

	public static void main(String[] args) 
	{
		BeerBottle beerBottle=new BeerBottle();  //通过new 关键字创建啤酒瓶对象
		//beerBottle 对象的引用
		beerBottle.bottom=70;
		beerBottle.height=280;
		beerBottle.capacity=580;

		System.out.println("----bottom="+beerBottle.bottom+"mm---height="+beerBottle.height+
		"mm---capacity="+beerBottle.capacity+beerBottle.capacityUnit);

		beerBottle.beer.alcohol=15;
		beerBottle.beer.expirationDate=180;

		System.out.println("---酒精度="+beerBottle.beer.alcohol+"%"+"---有效期="+beerBottle.beer.expirationDate+"天");

		//对象.方法名(参数)
		beerBottle.addBeer(beerBottle.beer);
		
	}

	//对象的行为就是它的函数 <===> 方法
	boolean addBeer(Beer beer) //我们所有的参数都是引用传递，不是传递对象
	{
		addBeerCount=addBeerCount+1;
		System.out.println("添加啤酒成功"+beer.alcohol+"%"+"----啤酒瓶数量="+addBeerCount);
		return true;
	}

}
