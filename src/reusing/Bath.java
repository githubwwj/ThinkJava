package reusing;

import static com.wwj.util.Print.*;
/**
 * 浴室
 * @author wwj
 */
public class Bath {
//	1 在定义对象的时候
//	2 在类的构造器中
//	3 就在正在使用对象之前
//	4 使用实例初始化
	
	private String name; // null 定义对象初始话
	private String shape; // null 形状
	Soap soap = new Soap(); // 定义对象初始话
	private int length; // 长度 0
	private int capacity; // 容量 0
	
	Bath() {
		System.out.println("Bath()");
		name = "家里的浴室";
		length = 260;
	}
	
	//使用实例初始
	{
		System.out.println("Bath实例初始化");
		capacity = 200;
	}
	
	public String toString() {
		if(shape ==null) {
			shape = "长方形";
		}
		return "name="+name +"  shape="+shape
				+"  length="+length+"  capacity="+capacity
				+"  soap="+soap;
	}
	
	public static void main(String[] args) {
		Bath bath =new Bath();
		print(bath);
	}

}
