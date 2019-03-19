package com.wwj.control;

/**
 * 圣代冰淇淋
 * @author wwj
 */
public class Sundae {
	
	/**
	 * 创建多少个冰淇淋
	 */
	private static int count;
	
	/**
	 * 构造函数私有,外部不能通过构造函数创建对象
	 */
	private Sundae() {
		
	}
	
	/**
	 * 通过静态方法创建一个圣代冰淇淋
	 * @return
	 */
	public static Sundae makeSundae() {
		count++;
		return new Sundae();
	}
	
	public void print() {
		System.out.println("------圣代冰淇淋"+count+"个");
	}

}
