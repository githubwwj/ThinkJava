package com.wwj.control;

//单实例
public class SingleInstance {

	/**
	 * 构造函数私有化,外部就不能创建对象
	 */
	private SingleInstance() {
	}

	private static SingleInstance mSingleInstance;

	/**
	 * 通过静态方法指定如何创建对象
	 * @return
	 */
	public static SingleInstance getSingleInstance() {
		if (null == mSingleInstance) {
			mSingleInstance = new SingleInstance();
		}
		return mSingleInstance;
	}
	
	protected void print() {
		System.out.println("我是一个单实例对象");
	}

}
