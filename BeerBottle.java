class BeerBottle //定义一个平酒瓶类
{
	int bottom; // 70mm 属性<===>成员变量 <==> 外观
	int height;// 280
	int outside;// 26
	int inside; //15
	float capacity; //580ml   //代表注释
	String capacityUnit="ml";
	//java会自动给类的成员变量初始化值，但是有时候初始化的值不正确，所以我们手动初始化程序的初始值是很重要的

	public static void main(String[] args) 
	{
		BeerBottle beerBottle=new BeerBottle();  //通过new 关键字创建啤酒瓶对象
		//beerBottle 对象的引用
		beerBottle.bottom=70;
		beerBottle.height=280;
		beerBottle.capacity=580;

		System.out.println("----bottom="+beerBottle.bottom+"mm---height="+beerBottle.height+
		"mm---capacity="+beerBottle.capacity+beerBottle.capacityUnit);

	}

	//对象的行为就是它的函数 <===> 方法



}
